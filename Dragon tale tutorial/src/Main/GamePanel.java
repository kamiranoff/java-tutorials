package Main;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import GameState.GameStateManager;

/**
 * Created by kevin on 03/01/16.
 */
public class GamePanel extends JPanel implements Runnable, KeyListener{

  final static Logger logger = LoggerFactory.getLogger(GamePanel.class);

  //dimensions
  public static final int WIDTH = 320;
  public static final int HEIGHT = 240;
  public static final int SCALE = 2;


  //game thread
  private Thread thread;
  private boolean running;
  private int FPS = 60;
  private long targetTime = 1000/FPS;


  //image
  private BufferedImage image;
  private Graphics2D g;

  //game state manager
  private GameStateManager gsm;

  public GamePanel(){
    super();
    setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
    setFocusable(true);
    requestFocus();
  }


  public void addNotify(){
    super.addNotify();
    if(thread == null){
      thread = new Thread(this);
      addKeyListener(this);
      thread.start();
    }
  }

  public void init(){
    image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
    g = (Graphics2D) image.getGraphics();
    running = true;

    gsm = new GameStateManager();
  }

  public void run(){
    init();

    int fps = 60;//frames per second
    double timePerTick = 1_000_000_000 / fps; //time in nano seconds
    double delta = 0;
    long now;
    long lastTime = System.nanoTime(); //amount of time in nano seconds;
    long timer = 0;
    int ticks = 0;
    long delay = 5_000_000_000L;
    int delayDivider = 5;


    while (running){
      //make sure the game render the same in slow or fast computer
      now = System.nanoTime(); //current time of computer
      delta += (now -lastTime) / timePerTick; //amount of time since last now call divided by the max number of tick
      timer += now -lastTime;
      lastTime = now;


      if(delta >= 1){
        update();//frames
        draw();
        drawToScreen();
        ticks++;
        delta--;

      }

      if(timer >= delay){
        logger.info("Ticks and Frames: " + ticks / delayDivider);
        ticks = 0;
        timer =0;
      }
    }

    stop();
  }


  //stop the thread
  public synchronized void stop(){

    if(!running){
      return; //if game already stopped
    }
    try {
      thread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private void update(){
    gsm.update();
  }

  private void draw(){
    gsm.draw(g);

  }

  private void drawToScreen(){
    Graphics g2 = getGraphics();
    g2.drawImage(image ,0,0,WIDTH * SCALE,HEIGHT * SCALE,null);
    g2.dispose();
  }

  public void keyTyped(KeyEvent key){}
  public void keyPressed(KeyEvent key){
    gsm.keyPressed(key.getKeyCode());
  }
  public void keyReleased(KeyEvent key){
    gsm.keyRealeased(key.getKeyCode());
  }
}
