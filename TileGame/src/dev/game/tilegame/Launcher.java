package dev.game.tilegame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by kevin on 03/01/16.
 * Watching: https://www.youtube.com/watch?v=zWDCmH21G30&list=PLah6faXAgguMnTBs3JnEJY0shAc18XYQZ&index=28
 * Finished video 29 - waiting for next video to be released
 */
public class Launcher {

  final static Logger logger = LoggerFactory.getLogger(Launcher.class);


  public static void main(String[] args){
    logger.info("Main method - Entry point");

    Game game = new Game("Lost in the Jungle!",1280,1000);
    game.start();

  }

}
