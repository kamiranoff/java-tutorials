package dev.game.tilegame.states;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

import dev.game.tilegame.Game;
import dev.game.tilegame.entities.creatures.Player;
import dev.game.tilegame.gfx.Assets;
import dev.game.tilegame.tiles.Tile;
import dev.game.tilegame.worlds.World;

/**
 * Created by kevin on 07/01/16.
 */
public class GameState extends State {

  final static Logger logger = LoggerFactory.getLogger(GameState.class);

  private Player player;
  private World world;

  public GameState(Game game){

    super(game);

    logger.debug("Working Directory = " + System.getProperty("user.dir"));

    player = new Player(game,100,100);
    world = new World(game, "src/resources/worlds/world1.txt");


  }

  @Override
  public void tick() {
    world.tick();
    player.tick();
  }

  @Override
  public void render(Graphics g) {
    world.render(g);
    player.render(g);

  }
}
