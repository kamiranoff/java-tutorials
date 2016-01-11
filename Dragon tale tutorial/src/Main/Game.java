package Main;

import javax.swing.JFrame;

/**
 * Created by kevin on 03/01/16.
 */
public class Game {

  public static void main(String[] argd){
    JFrame window = new JFrame("Dragon Tale");
   window.setContentPane(new GamePanel());
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.pack();
    window.setVisible(true);
  }
}
