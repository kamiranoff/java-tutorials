package dev.game.tilegame.tiles;

import java.awt.image.BufferedImage;

import dev.game.tilegame.gfx.Assets;

/**
 * Created by kevin on 09/01/16.
 */
public class RockTile extends Tile {
  public RockTile(int id) {

    super(Assets.rock, id);
  }

  @Override
  public boolean isSolid(){
    return true;
  }

}
