package dev.game.tilegame.states;

import java.awt.*;

/**
 * Created by kevin on 07/01/16.
 */
public abstract class State {

  private static State currentState = null;

  public static void setState(State state){
    currentState = state;
  }

  public static State getState(){
    return currentState;
  }


  //CLASS
  public abstract void tick();
  public abstract void render(Graphics g);
}
