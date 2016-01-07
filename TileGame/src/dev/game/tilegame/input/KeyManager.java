package dev.game.tilegame.input;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by kevin on 07/01/16.
 */
public class KeyManager implements KeyListener {

  final static Logger logger = LoggerFactory.getLogger(KeyManager.class);

  private boolean[] keys;
  public boolean up,down,left,right;


  public KeyManager(){
    keys = new boolean[256];
  }

  public void tick(){
    up = keys[KeyEvent.VK_W] || keys[KeyEvent.VK_UP];
    down = keys[KeyEvent.VK_S] ||  keys[KeyEvent.VK_DOWN];
    left = keys[KeyEvent.VK_A] || keys[KeyEvent.VK_LEFT];
    right = keys[KeyEvent.VK_D] || keys[KeyEvent.VK_RIGHT];
  }

  @Override
  public void keyPressed(KeyEvent e) {
    keys[e.getKeyCode()] = true;
    logger.info("Pressed");

  }

  @Override
  public void keyReleased(KeyEvent e) {
    keys[e.getKeyCode()] = false;
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

}
