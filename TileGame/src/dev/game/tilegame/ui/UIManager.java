package dev.game.tilegame.ui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import dev.game.tilegame.Handler;

/**
 * Created by kevin on 07/08/16.
 */
public class UIManager {

  private Handler handler;
  private ArrayList<UIObject> objects;

  public UIManager(Handler handler){
    this.handler = handler;
    objects = new ArrayList<UIObject>();
  };

  public void tick(){
    for(UIObject object : objects) {
      object.tick();
    }
  }

  public void render(Graphics g){
    for(UIObject object : objects) {
      object.render(g);
    }
  }

  public void onMouseMove(MouseEvent e) {
    for(UIObject object : objects) {
      object.onMouseMove(e);
    }
  }

  public void onMouseRelease(MouseEvent e) {
    for(UIObject object : objects) {
      object.onMouseRelease(e);
    }
  }

  public void addObject(UIObject o) {
    objects.add(o);
  }

  public void removeObject(UIObject o) {
    objects.remove(o);
  }
}
