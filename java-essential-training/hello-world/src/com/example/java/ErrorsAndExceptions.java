package com.example.java;

import java.util.logging.Logger;

/**
 * Created by kevin on 02/01/16.
 */
public class ErrorsAndExceptions {

  public static void main(String[] args){
    String s = null;
    System.out.println(s);

    String welcome = "Welcome!";
    char[] chars = welcome.toCharArray();
    try {

      if(chars.length < 10){
        throw (new Exception("My custom message"));
      }

      char lastChar = chars[chars.length - 1];
      System.out.println(lastChar);

      String sub = welcome.substring(10);

    }catch (ArrayIndexOutOfBoundsException e){
//      e.printStackTrace();
      System.out.println("Array error");

    }catch (StringIndexOutOfBoundsException e){
      System.out.println("String out of bounds");

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
