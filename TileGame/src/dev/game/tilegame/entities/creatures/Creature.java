package dev.game.tilegame.entities.creatures;

import dev.game.tilegame.Game;
import dev.game.tilegame.Handler;
import dev.game.tilegame.entities.Entity;
import dev.game.tilegame.tiles.Tile;

/**
 * Created by kevin on 07/01/16.
 */
public abstract class Creature extends Entity {


  public static final int DEFAULT_HEALTH = 10;
  public static final float DEFAULT_SPEED = 3.0f;
  public static final int DEFAULT_CREATURE_WIDTH = 120;
  public static final int DEFAULT_CREATURE_HEIGHT = 120;

  protected int health;
  protected float speed;
  protected float xMove,yMove;

  public Creature(Handler handler,float x,float y,int width,int height) {
    super(handler,x,y,width,height);
    this.handler = handler;
    health = DEFAULT_HEALTH;
    speed = DEFAULT_SPEED;
    xMove = 0;
    yMove = 0;
  }

  public void move(){
    if(!checkEntityCollisions(xMove,0f)){
      moveX();
    }
    if(!checkEntityCollisions(0,yMove)){
      moveY();
    }
  }

  public void moveX(){
   if(xMove > 0){//Moving right
     int nextTileOnX = (int)(x + xMove + bounds.x + bounds.width) / Tile.TILE_WIDTH;

     if(
             !collisionWithTile(nextTileOnX, (int) (y + bounds.y)/ Tile.TILE_HEIGHT) &&
             !collisionWithTile(nextTileOnX, (int) (y + bounds.y +bounds.height ) / Tile.TILE_HEIGHT)){
       x += xMove;
     }else{
       x = nextTileOnX * Tile.TILE_WIDTH - bounds.x - bounds.width - 1;//1 pixel gap
     }

   }else if(xMove < 0){//moving left
     int nextTileOnX = (int)(x + xMove + bounds.x) / Tile.TILE_WIDTH;

     if(
             !collisionWithTile(nextTileOnX, (int) (y + bounds.y)/ Tile.TILE_HEIGHT) &&
                     !collisionWithTile(nextTileOnX, (int) (y + bounds.y +bounds.height ) / Tile.TILE_HEIGHT)){
       x += xMove;
     }else{
       x = nextTileOnX * Tile.TILE_WIDTH + Tile.TILE_WIDTH - bounds.x;
     }
   }
  }

  public void moveY(){
   if(yMove < 0){//Moving Up
     int nextTileOnY = (int)(y + yMove + bounds.y) / Tile.TILE_HEIGHT;

     if(
         !collisionWithTile((int) (x + bounds.x)/ Tile.TILE_WIDTH,nextTileOnY) &&
         !collisionWithTile((int) (x + bounds.x +bounds.width) / Tile.TILE_WIDTH,nextTileOnY)){
       y += yMove;
     }else{
       y = nextTileOnY * Tile.TILE_HEIGHT + Tile.TILE_HEIGHT - bounds.y;
     }


   }else if(yMove >0) {//Moving down
     int nextTileOnY = (int)(y + yMove + bounds.y +bounds.height) / Tile.TILE_HEIGHT;
     if(
         !collisionWithTile((int) (x + bounds.x)/ Tile.TILE_WIDTH,nextTileOnY) &&
         !collisionWithTile((int) (x + bounds.x +bounds.width) / Tile.TILE_WIDTH,nextTileOnY)){
       y += yMove;
     }else{
       y = nextTileOnY * Tile.TILE_HEIGHT  - bounds.y - bounds.height -1;
     }
   }
  }

  protected boolean collisionWithTile(int x,int y){
    return handler.getWorld().getTile(x,y).isSolid();
  }



  //GETTERS SETTERS
  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public float getSpeed() {
    return speed;
  }

  public void setSpeed(float speed) {
    this.speed = speed;
  }

  public float getxMove() {
    return xMove;
  }

  public void setxMove(float xMove) {
    this.xMove = xMove;
  }

  public float getyMove() {
    return yMove;
  }

  public void setyMove(float yMove) {
    this.yMove = yMove;
  }
}
