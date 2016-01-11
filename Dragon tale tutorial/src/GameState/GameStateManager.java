package GameState;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by kevin on 11/01/16.
 */
public class GameStateManager {

  private ArrayList<GameState> gameStates;
  private int currentState;

  public static final int MENU_STATE = 0;
  public static final int LEVEL1_STATE = 1;

  public GameStateManager(){
    gameStates = new ArrayList<GameState>();

    currentState = 0;
    gameStates.add(new MenuState(this));
    gameStates.add(new Level1State(this));
  }

  public void setState(int state){
    currentState = state;
    gameStates.get(currentState).init();
  }

  public void update(){
    gameStates.get(currentState).update();
  }

  public void draw(Graphics2D g){
    gameStates.get(currentState).draw(g);
  }

  public void keyPressed(int k){
    gameStates.get(currentState).keyPressed(k);
  }

  public void keyRealeased(int k){
    gameStates.get(currentState).keyReleased(k);
  }
}
