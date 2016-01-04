package dev.game.tilegame.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Created by kevin on 04/01/16.
 */
public class ImageLoader {

  public static BufferedImage loadImage(String path){
    try {
      return ImageIO.read(ImageLoader.class.getResource(path));
    } catch (IOException e) {
      e.printStackTrace();

      //doesnt run the game if the image does not load
      System.exit(1);
    }
    return null;
  }
}
