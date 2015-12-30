/**
 * Created by kevin on 30/12/15.
 * Watching Java Essential Training 2015
 * Watching 05_02 - Working with primitive varaibles
 */

package com.example.java;

public class Main {

  public static void main(String[] args){

    byte myByte = 8; //8 bits value from -128 to 127
    short myShort = 32000;// 16 bits value from -32,768 to 32,767
    int myInt = 100000; //32 bits
    long myLong = 10000000; //64 bits
    float myFloat  = 0.4f; //32 bits - not recommanded - use double instead
    double myDouble = 2222020023.12123; //64 bits
    byte byteValue = (byte) myDouble;


    String aString = "Kevin";
    System.out.println("Hello " + aString);
    System.out.println("bite " + myByte);
    System.out.println("short " + myShort);
    System.out.println("int " + myInt);
    System.out.println("long " + myLong);
    System.out.println("float " + myFloat);
    System.out.println("Hello " + myDouble);
    System.out.println("byte from double " + byteValue);

  }

}
