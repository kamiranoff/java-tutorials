package dev.game.tilegame.gfx;

import java.awt.image.BufferedImage;

/**
 * Created by kevin on 04/01/16.
 */
public class SpriteSheet {

  private BufferedImage sheet;

  public SpriteSheet(BufferedImage sheet){
    this.sheet = sheet;
  }

  //return a new buffered image from a sprite sheet with the specified area
  public BufferedImage crop(int x,int y, int width,int height){
    return sheet.getSubimage(x,y,width,height);
  }
}
