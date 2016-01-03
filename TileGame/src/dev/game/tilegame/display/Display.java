package dev.game.tilegame.display;

import java.awt.*;

import javax.swing.*;

/**
 * Created by kevin on 03/01/16.
 */
public class Display {

  private JFrame frame;
  private Canvas canvas;

  private String title;
  private int width,height;

  public Display(String title,int width, int height){
    this.title = title;
    this.width = width;
    this.height = height;

    createDisplay();
  }

  private void createDisplay(){
    frame = new JFrame(title);
    frame.setSize(width,height);

    //makes sur the window and game terminates
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setResizable(false);

    //makes the window appears at the center of the screen
    frame.setLocationRelativeTo(null);

    //makes window visible
    frame.setVisible(true);

    //Cancvas initialization
    canvas = new Canvas();
    canvas.setPreferredSize(new Dimension(width,height));
    canvas.setMaximumSize(new Dimension(width,height));
    canvas.setMinimumSize(new Dimension(width,height));

    frame.add(canvas);
    //make sure all of the canvas is visible
    frame.pack();
  }

  //getter for canvas
  public Canvas getCanvas(){
    return canvas;
  }
}
