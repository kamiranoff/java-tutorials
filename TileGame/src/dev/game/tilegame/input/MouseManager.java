package dev.game.tilegame.input;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import dev.game.tilegame.ui.UIManager;

/**
 * Created by kevin on 12/03/16.
 */
public class MouseManager implements MouseListener,MouseMotionListener {

  final static Logger logger = LoggerFactory.getLogger(KeyManager.class);

  private boolean leftPressed,rightPressed;
  private int mouseX,mouseY;
  private UIManager uiManager;



  public MouseManager(){

  }

  public void setUIManager(UIManager uiManager) {
    this.uiManager = uiManager;
  }



  //Implemented methods

  @Override
  public void mousePressed(MouseEvent e) {
    if(e.getButton() == MouseEvent.BUTTON1){
      leftPressed = true;
    }else if(e.getButton() == MouseEvent.BUTTON3){
      rightPressed = true;
    }
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    if(e.getButton() == MouseEvent.BUTTON1){
      leftPressed = false;
    }else if(e.getButton() == MouseEvent.BUTTON3){
      rightPressed = false;

    }

    if(uiManager != null) {
      uiManager.onMouseRelease(e);
    }
  }

  @Override
  public void mouseMoved(MouseEvent e) {
    mouseX = e.getX();
    mouseY = e.getY();


    if(uiManager != null) {
      uiManager.onMouseMove(e);
    }
  }



  @Override
  public void mouseClicked(MouseEvent e) {

  }


  @Override
  public void mouseEntered(MouseEvent e) {

  }

  @Override
  public void mouseExited(MouseEvent e) {

  }

  @Override
  public void mouseDragged(MouseEvent e) {

  }




  //getters
  public boolean isLeftPressed(){
    return leftPressed;
  }

  public boolean isRightPressed(){
    return rightPressed;
  }

  public int getMouseX() {
    return mouseX;
  }

  public int getMouseY() {
    return mouseY;
  }
}
