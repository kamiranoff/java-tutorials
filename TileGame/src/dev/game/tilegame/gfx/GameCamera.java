package dev.game.tilegame.gfx;

import dev.game.tilegame.Game;
import dev.game.tilegame.entities.Entity;

/**
 * Created by kevin on 09/01/16.
 */
public class GameCamera {

  private Game game;
  private float xOffset,yOffset;

  public GameCamera(Game game,float xOffset,float yOffset) {
    this.game = game;
    this.xOffset = xOffset;
    this.yOffset = yOffset;
  }


  public void centerOnEntity(Entity entity){
    xOffset = entity.getX() - game.getWidth()/2 + entity.getWidth()/2;
    yOffset = entity.getY() - game.getHeight()/2 + entity.getHeight()/2;
  }

  public void move(float xAmt,float yAmt){
    xOffset += xAmt;
    yOffset += yAmt;
  }

  public float getxOffset() {
    return xOffset;
  }

  public void setxOffset(float xOffset) {
    this.xOffset = xOffset;
  }

  public float getyOffset() {
    return yOffset;
  }

  public void setyOffset(float yOffset) {
    this.yOffset = yOffset;
  }




}
