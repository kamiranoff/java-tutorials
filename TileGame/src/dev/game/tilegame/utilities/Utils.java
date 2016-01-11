package dev.game.tilegame.utilities;

import com.sun.media.jfxmedia.logging.Logger;

import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

/**
 * Created by kevin on 09/01/16.
 */
public class Utils {

  final static org.slf4j.Logger logger = LoggerFactory.getLogger(Utils.class);

  public static String loadFileAsString(String path){
    StringBuilder builder = new StringBuilder();


    try {
      InputStream is = Utils.class.getResourceAsStream(path);
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String line;
      while ((line = br.readLine()) != null){
        builder.append(line +"\n");
      }
      br.close();
    }catch (IOException e){
      logger.error("IOException -> ", e);
    }

    return builder.toString();
  }

  public static int parseInt(String number){
    try {
      return Integer.parseInt(number);
    }catch (NumberFormatException e){
      logger.error("NumberFormatException -> ",e);
      return 0;
    }
  }


}
