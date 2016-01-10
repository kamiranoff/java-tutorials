package dev.game.tilegame.entities.statics;

import java.awt.*;

import dev.game.tilegame.Handler;
import dev.game.tilegame.gfx.Assets;
import dev.game.tilegame.tiles.Tile;

/**
 * Created by kevin on 10/01/16.
 */
public class Tree extends StaticEntity {


  public Tree(Handler handler, float x, float y) {
    super(handler, x, y, Tile.TILE_WIDTH, Tile.TILE_HEIGHT * 2);

    //bounds for collision
    bounds.x =20;
    bounds.y = 280;
    bounds.width=100;
    bounds.height=100;
  }


  @Override
  public void tick() {

  }

  @Override
  public void render(Graphics g) {
    g.drawImage(Assets.tree,
              (int) (x - handler.getGameCamera().getxOffset()),
            (int) (y -handler.getGameCamera().getyOffset() ),
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
}
