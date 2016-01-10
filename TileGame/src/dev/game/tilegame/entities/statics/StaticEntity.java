package dev.game.tilegame.entities.statics;

import dev.game.tilegame.Handler;
import dev.game.tilegame.entities.Entity;

/**
 * Created by kevin on 10/01/16.
 */
public abstract class StaticEntity extends Entity {
  public StaticEntity(Handler handler,float x,float y, int width,int height) {
    super(handler,x,y,width,height);
  }
}
