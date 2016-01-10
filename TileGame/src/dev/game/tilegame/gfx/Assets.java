package dev.game.tilegame.gfx;

import java.awt.image.BufferedImage;

/**
 * Created by kevin on 04/01/16.
 */
public class Assets {


  //private static final int PLAYER_WIDTH = 110,PLAYER_HEIGHT = 115,PLAYER_GAP_X = 50,PLAYER_START_X=20,PLAYER_START_Y=160;
  private static final int PLAYER_WIDTH = 68,PLAYER_HEIGHT = 80,PLAYER_GAP_X = 35,PLAYER_START_X=20;
  private static final int BG_WIDTH = 272 , BG_HEIGHT = 208,BG_GAP = 8;
  private static final int TREE_WIDTH=100,TREE_HEIGHT=130,TREE_GAP=14;
  private static final int ROCK_WIDTH=128,ROCK_HEIGHT=128;

  public static BufferedImage dirt,grass,stone,tree,rock;
  public static BufferedImage[] player_down;
  public static BufferedImage[] player_up;
  public static BufferedImage[] player_still;



  public static void init(){
    //SpriteSheet playerSheet = new SpriteSheet(ImageLoader.loadImage("/resources/textures/sprites_mvc2_psylocke.png"));

    SpriteSheet backgroundSheet = new SpriteSheet(ImageLoader.loadImage("/resources/textures/backgrounds.png"));
    SpriteSheet treeSheet = new SpriteSheet(ImageLoader.loadImage("/resources/textures/trees1.png"));
    SpriteSheet rockSheet = new SpriteSheet(ImageLoader.loadImage("/resources/textures/rock4.png"));
    SpriteSheet playerSheet = new SpriteSheet(ImageLoader.loadImage("/resources/textures/blond-girl.png"));

    //crop(x,y,width,height);
    //player = playerSheet.crop(PLAYER_START_X,PLAYER_START_Y,PLAYER_WIDTH,PLAYER_HEIGHT);

    player_down = new BufferedImage[5];
    for (int i = 0; i < player_down.length ; i++) {
      player_down[i] = playerSheet.crop(PLAYER_WIDTH * i,0,PLAYER_WIDTH,PLAYER_HEIGHT);
    }

    player_up = new BufferedImage[5];
    for (int i = 0; i < player_up.length ; i++) {
      player_up[i] = playerSheet.crop(PLAYER_WIDTH * i,PLAYER_HEIGHT,PLAYER_WIDTH,PLAYER_HEIGHT);
    }

    player_still = new BufferedImage[5];
    for (int i = 0; i < player_still.length ; i++) {
      player_still[i] = playerSheet.crop(PLAYER_WIDTH * i,PLAYER_HEIGHT * 2,PLAYER_WIDTH,PLAYER_HEIGHT);
    }

    grass = backgroundSheet.crop(BG_GAP, BG_GAP * 2 + BG_HEIGHT,BG_WIDTH,BG_HEIGHT);
    dirt = backgroundSheet.crop(BG_GAP * 5 + BG_WIDTH * 4, BG_GAP,BG_WIDTH,BG_HEIGHT);
    tree = treeSheet.crop(TREE_GAP + TREE_WIDTH,TREE_HEIGHT,TREE_WIDTH,TREE_HEIGHT);
    rock = rockSheet.crop(0,0,ROCK_WIDTH,ROCK_HEIGHT);



  }

}
