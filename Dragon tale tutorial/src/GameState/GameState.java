package GameState;

import java.awt.*;

/**
 * Created by kevin on 11/01/16.
 */
public abstract class GameState {

  protected GameStateManager gsm;

  public abstract void init();
  public abstract void update();
  public abstract void draw(Graphics2D g);
  public abstract void keyPressed(int k);
  public abstract void keyReleased(int k);
}
