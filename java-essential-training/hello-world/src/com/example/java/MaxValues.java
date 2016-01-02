package com.example.java;

/**
 * Created by kevin on 01/01/16.
 */
public class MaxValues {

  public static void main(String[] args){
    byte b = 127;
    System.out.println("Byte: "+b);

    if(b < Byte.MAX_VALUE){
      b++;
    }

    System.out.println("Byte: "+b);
    int intValue = 1090900000;
    short myShort = (short) intValue;
    System.out.println("My short:"+ myShort);


    double doubleValue = -3.999999;
    long rounded = Math.round(doubleValue);
    System.out.println("rounded: "+ rounded);


    double absValue = Math.abs(doubleValue);
    System.out.println("absolute: " + absValue);
  }
}
