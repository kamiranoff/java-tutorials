package dev.game.tilegame.states;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.nio.file.Path;
import java.nio.file.Paths;

import dev.game.tilegame.Handler;

import dev.game.tilegame.worlds.World;

/**
 * Created by kevin on 07/01/16.
 */
public class GameState extends State {

  final static Logger logger = LoggerFactory.getLogger(GameState.class);

  private World world;


  public GameState(Handler handler){

    super(handler);

    String worldFile = "/resources/worlds/world1.txt";

    logger.debug("Working Directory = " + System.getProperty("user.dir"));

    world = new World(handler, worldFile);

    logger.info("Game width in tiles: " + world.getWidth());
    logger.info("Game height in tiles: " + world.getHeight());



    handler.setWorld(world);


  }

  @Override
  public void tick() {
    world.tick();
  }

  @Override
  public void render(Graphics g) {
    world.render(g);

  }
}
