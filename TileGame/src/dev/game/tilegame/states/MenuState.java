package dev.game.tilegame.states;

import java.awt.*;

import dev.game.tilegame.Game;
import dev.game.tilegame.Handler;

/**
 * Created by kevin on 07/01/16.
 */
public class MenuState extends State {


  public MenuState(Handler handler) {
    super(handler);
  }

  @Override
  public void tick() {
    if(handler.getMouseManager().isLeftPressed()){
      State.setState(handler.getGame().gameState);
    }
  }

  @Override
  public void render(Graphics g) {
    g.setColor(Color.orange);
    g.fillRect(handler.getMouseManager().getMouseX(),handler.getMouseManager().getMouseY(),8,8);
  }
}
