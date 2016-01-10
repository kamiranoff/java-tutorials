package dev.game.tilegame.entities.creatures;

import java.awt.*;
import java.awt.image.BufferedImage;

import dev.game.tilegame.Game;
import dev.game.tilegame.Handler;
import dev.game.tilegame.gfx.Animation;
import dev.game.tilegame.gfx.Assets;

/**
 * Created by kevin on 07/01/16.
 */
public class Player extends Creature {

  //Animations
  private Animation animStill,animDown,animUp,animLeft,animRight;
  private int animLength = 100;


  public Player(Handler handler,float x, float y) {
    super(handler,x, y,Creature.DEFAULT_CREATURE_WIDTH * 2,Creature.DEFAULT_CREATURE_HEIGHT *2);
    speed = speed * 3;


    //bounds for collision
    bounds.x =115;
    bounds.y = 200;
    bounds.width=10;
    bounds.height=10;


    //Animations
    animDown = new Animation(animLength,Assets.player_down);
    animUp = new Animation(animLength,Assets.player_up);
    animStill = new Animation(animLength,Assets.player_still);
  }

  @Override
  public void tick() {

    //Animations
    animStill.tick();
    animDown.tick();
    animUp.tick();


    //moving player;
    getInput();
    move();
    handler.getGameCamera().centerOnEntity(this);

  }

  private void getInput(){
    xMove = 0;
    yMove = 0;

    if(handler.getKeyManager().up){
      yMove = -speed;
    }
    if(handler.getKeyManager().down){
      yMove = speed;
    }
    if(handler.getKeyManager().left){
      xMove = -speed;
    }
    if(handler.getKeyManager().right){
      xMove = speed;
    }
  }

  @Override
  public void render(Graphics g) {
    g.drawImage(
            getCurrentAnimationFrame(),
            (int) (x -handler.getGameCamera().getxOffset()),
            (int) (y -handler.getGameCamera().getyOffset()),
            width,
            height,
            null
    );


    //TESTING COLLISION SURFACE
//    g.setColor(Color.red);
//    g.fillRect((int)(x + bounds.x -handler.getGameCamera().getxOffset()),
//            (int)(y + bounds.y - handler.getGameCamera().getyOffset()),
//            bounds.width,
//            bounds.height
//    );

  }

  private BufferedImage getCurrentAnimationFrame(){

    if(xMove < 0){
      return animDown.getCurrentFrame();
    }else if(xMove > 0){
      return animUp.getCurrentFrame();
    }else if(yMove < 0){
      return animUp.getCurrentFrame();
    }else if(yMove > 0){
      return animDown.getCurrentFrame();
    }else{
      return animStill.getCurrentFrame();
    }
  }
}
