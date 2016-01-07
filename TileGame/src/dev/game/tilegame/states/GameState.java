package dev.game.tilegame.states;

import java.awt.*;

import dev.game.tilegame.Game;
import dev.game.tilegame.entities.creatures.Player;
import dev.game.tilegame.gfx.Assets;

/**
 * Created by kevin on 07/01/16.
 */
public class GameState extends State {

  private Player player;

  public GameState(Game game){
    super(game);
    player = new Player(game,100,100);
  }

  @Override
  public void tick() {
    player.tick();
  }

  @Override
  public void render(Graphics g) {
    g.drawImage(Assets.dirt,0,0,null);
    player.render(g);
  }
}
