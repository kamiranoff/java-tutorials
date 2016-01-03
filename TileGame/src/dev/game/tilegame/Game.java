package dev.game.tilegame;




import java.awt.*;
import java.awt.image.BufferStrategy;

import dev.game.tilegame.display.Display;

/**
 * Created by kevin on 03/01/16.
 * Main part of the game
 * Start and end the game
 */

//implements Runnable allow the program to run on a thread
public class Game implements Runnable {


  private Display display;

  public int width,height;
  public String title;

  private boolean running = false;

  //a thread is a mini program that runs separately within the main program
  private Thread thread;

  // A buffer stategy tells the computer how to draw things to the screen
  // A buffer A "hidden" computer screen within your computer
  // Prevent flickering
  private BufferStrategy bs;
  private Graphics g;

  //constructor method
  public Game(String title, int width, int height){

    this.width = width;
    this.height = height;
    this.title = title;


  }

  private void init(){
    //Create a display when we create a new instance of Game
    display = new Display(title,width,height);
  }

  //update everything
  private void tick(){

  }

  //render everything
  private void render(){
    bs = display.getCanvas().getBufferStrategy();

    if(bs == null){
      //create 3 buffers if buffer is null the first time
      display.getCanvas().createBufferStrategy(3);
      return;
    }

    //g is the graphic object
    //the graphic object allow to draw things to the canvas
    //like a magical paint brush
    g = bs.getDrawGraphics();



    //Draw Here


    g.fillRect(0,0,width,height);//x,y,width,height

    //End drawing

    //show and dispose properly
    bs.show();
    g.dispose();

  }

  //method needed when implementing Runnable
  public void run(){

    init();

    while (running){
      tick();
      render();
    }

    stop();
  }

  //start the thread
  public synchronized void start(){

    if(running){
      return;//stops everything if game already running
    }
    running = true;

    thread = new Thread(this); // this is  the Game Class
    thread.start();//call the run method
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
}
