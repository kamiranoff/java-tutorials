package dev.game.tilegame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by kevin on 03/01/16.
 * Watching https://www.youtube.com/watch?v=MYVSIcVuDmM&list=PLah6faXAgguMnTBs3JnEJY0shAc18XYQZ&index=13
 * Currently at : New Beginner 2D Game Programming - 13 - Player - 00:00
 */
public class Launcher {

  final static Logger logger = LoggerFactory.getLogger(Launcher.class);


  public static void main(String[] args){
    logger.info("Main method - Entry point");

    Game game = new Game("Title!",1280,800);
    game.start();

  }

}
