package dev.game.tilegame.worlds;

import java.awt.*;

import dev.game.tilegame.Game;
import dev.game.tilegame.Handler;
import dev.game.tilegame.entities.EntityManager;
import dev.game.tilegame.entities.creatures.Player;
import dev.game.tilegame.entities.statics.Tree;
import dev.game.tilegame.tiles.Tile;
import dev.game.tilegame.utilities.Utils;

/**
 * Created by kevin on 09/01/16.
 */



public class World {


  private Handler handler;
  private int width,height,spawnX,spawnY;
  private int [][] tilesPosition;

  //Entities
  private EntityManager entityManager;

  public World(Handler handler,String path){
    this.handler = handler;




    loadWorld(path);

    //Set initial player location to center of the map
    int mapCenterX = (this.getWidth() * Tile.TILE_WIDTH / 2) ;
    int mapCenterY =(this.getHeight() * Tile.TILE_HEIGHT / 2);
    int playerInitialLocationX = mapCenterX;
    int playerInitialLocationY = mapCenterY - Tile.TILE_HEIGHT;

    //Set initial player position to the center of the map be fore using spawnX and spawnY
    Player player = new Player(handler,playerInitialLocationX,playerInitialLocationY);


    entityManager = new EntityManager(handler,player);

    entityManager.addEntity(new Tree(handler, 300, 300));
    entityManager.addEntity(new Tree(handler, 300, 550));
    entityManager.addEntity(new Tree(handler, 700, 450));
    entityManager.getPlayer().setX(spawnX);
    entityManager.getPlayer().setY(spawnY);
  }



  public void tick(){
    entityManager.tick();
  }

  public void render(Graphics g){

    //only render what the user see
    int xStart = (int) Math.max(0,handler.getGameCamera().getxOffset() / Tile.TILE_WIDTH);
    int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILE_WIDTH + 1 );
    int yStart = (int) Math.max(0,handler.getGameCamera().getyOffset() / Tile.TILE_HEIGHT);
    int yEnd = (int) Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILE_HEIGHT + 1 );

    for (int y = yStart; y < yEnd ; y++) {
      for (int x = xStart; x < xEnd ; x++) {
        getTile(x,y).render(
                g,
                (int) (x * Tile.TILE_WIDTH - handler.getGameCamera().getxOffset()),
                (int) (y * Tile.TILE_HEIGHT -handler.getGameCamera().getyOffset())
        );

      }
    }

    //Entities
    entityManager.render(g);
  }

  public Tile getTile(int x,int y){

    //make sure player stays in bound
    if(x < 0 || y < 0 || x >= width || y >= height){
      return Tile.grassTile;
    }


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

    //Position of player from the world
    spawnX = Utils.parseInt(tokens[2]);
    spawnY = Utils.parseInt(tokens[3]);

    tilesPosition = new int[width][height];
    for (int y = 0; y < height ; y++) {
      for (int x = 0; x < width; x++) {
        tilesPosition[x][y] = Utils.parseInt(tokens[x+y * width + 4] );
      }
    }
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public EntityManager getEntityManager() {
    return entityManager;
  }

  public void setEntityManager(EntityManager entityManager) {
    this.entityManager = entityManager;
  }
}
