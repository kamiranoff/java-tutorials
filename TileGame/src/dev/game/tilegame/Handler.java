package dev.game.tilegame;

import dev.game.tilegame.gfx.GameCamera;
import dev.game.tilegame.input.KeyManager;
import dev.game.tilegame.input.MouseManager;
import dev.game.tilegame.worlds.World;

/**
 * Created by kevin on 10/01/16.
 */
public class Handler {

  private Game game;
  private World world;

  public Handler(Game game) {
    this.game = game;
  }

  public KeyManager getKeyManager(){
    return game.getKeyManager();
  }

  public MouseManager getMouseManager(){return game.getMouseManager();}

  public GameCamera getGameCamera(){
    return game.getGameCamera();
  }

  public int getWidth(){
    return game.getWidth();
  }

  public int getHeight(){
    return game.getHeight();
  }

  public Game getGame() {
    return game;
  }

  public void setGame(Game game) {
    this.game = game;
  }

  public World getWorld() {
    return world;
  }

  public void setWorld(World world) {
    this.world = world;
  }
}
