package GameState;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.nio.file.Path;
import java.nio.file.Paths;

import TileMap.Background;


/**
 * Created by kevin on 11/01/16.
 */
public class MenuState extends GameState {

  private Background bg;

  private String[] options ={
          "Start",
          "Help",
          "Quit"
  };

  private Color tileColor;
  private Font tileFont;
  private Font font;
  private int currentChoice;


  public MenuState(GameStateManager gsm) {
    this.gsm = gsm;


    try {
      Path currentRelativePath = Paths.get("");
      String s = currentRelativePath.toAbsolutePath().toString();
      System.out.println("Current relative path is: " + s);

      bg = new Background("/Backgrounds/menubg.gif",1);
      bg.setVector(-0.1,1);
      tileColor = new Color(128,0,0);
      tileFont = new Font("Century Gothic", Font.PLAIN,28);

      font = new Font("Arial",Font.PLAIN,12);



    }catch (Exception e){
      e.printStackTrace();
    }
  }

  @Override
  public void init() {

  }

  @Override
  public void update() {
    bg.update();

  }

  @Override
  public void draw(Graphics2D g) {
    //draw background
    bg.draw(g);

    //draw title;
    g.setColor(tileColor);
    g.setFont(tileFont);
    g.drawString("Dragon Tale", 80, 70);

    //draw menu option
    g.setFont(font);
    for (int i = 0; i < options.length ; i++) {

      if(i == currentChoice){
        g.setColor(Color.BLACK);
      }else{
        g.setColor(Color.ORANGE);
      }

      g.drawString(options[i],145, 140 + i *15);
    }
  }


  private void select(){
    if(currentChoice == 0){
      //start
      gsm.setState(GameStateManager.LEVEL1_STATE);
    }
    if(currentChoice == 1){
      //help
    }
    if(currentChoice == 2){
      System.exit(0);
    }

  }

  @Override
  public void keyPressed(int k) {
    if(k == KeyEvent.VK_ENTER){
      select();
    }

    if(k == KeyEvent.VK_UP){
      currentChoice--;
      if(currentChoice == -1){
        currentChoice = options.length -1;
      }
    }

    if(k == KeyEvent.VK_DOWN){
      currentChoice++;
      if(currentChoice == options.length){
        currentChoice = 0;
      }
    }


  }

  @Override
  public void keyReleased(int k) {

  }
}
