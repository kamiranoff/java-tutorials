package dev.game.tilegame.worlds;

import java.awt.*;

import dev.game.tilegame.Game;
import dev.game.tilegame.tiles.Tile;
import dev.game.tilegame.utilities.Utils;

/**
 * Created by kevin on 09/01/16.
 */



public class World {


  private Game game;
  private int width,height,spawnX,spawnY;
  private int [][] tilesPosition;

  public World(Game game,String path){
    this.game = game;
    loadWorld(path);

  }



  public void tick(){

  }

  public void render(Graphics g){
    for (int y = 0; y < height ; y++) {
      for (int x = 0; x < width ; x++) {
        getTile(x,y).render(
                g,
                (int) (x * Tile.TILE_WIDTH - game.getGameCamera().getxOffset()),
                (int) (y * Tile.TILE_HEIGHT -game.getGameCamera().getyOffset())
        );

      }
    }
  }

  public Tile getTile(int x,int y){
    Tile t = Tile.tiles[tilesPosition[x][y]];
    if(t == null){
      return Tile.dirtTile;
    }
    return t;
  }

  private void loadWorld(String path){
    String file = Utils.loadFileAsString(path);
    String[] tokens = file.split("\\s+");//split every number in its own string
    width = Utils.parseInt(tokens[0]);
    height = Utils.parseInt(tokens[1]);
    spawnX = Utils.parseInt(tokens[2]);
    spawnY = Utils.parseInt(tokens[3]);

    tilesPosition = new int[width][height];
    for (int y = 0; y < height ; y++) {
      for (int x = 0; x < width; x++) {
        tilesPosition[x][y] = Utils.parseInt(tokens[x+y * width + 4] );
      }
    }
  }
}
