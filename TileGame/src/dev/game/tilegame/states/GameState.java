package dev.game.tilegame.states;

import java.awt.*;

import dev.game.tilegame.gfx.Assets;

/**
 * Created by kevin on 07/01/16.
 */
public class GameState extends State {


  public GameState(){

  }

  @Override
  public void tick() {

  }

  @Override
  public void render(Graphics g) {
  g.drawImage(Assets.dirt,0,0,null);
  }
}
