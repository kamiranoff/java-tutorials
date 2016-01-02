package com.example.java;

import java.text.NumberFormat;

/**
 * Created by kevin on 01/01/16.
 */
public class Characters {

  public static void main(String[] args){
    char c1 = '1';
    char dollarSign = '\u0024';
    System.out.println("dollarSign: "+ dollarSign);

    char k = 'k';
    char e = 'e';
    char v = 'v';
    char i = 'i';
    char n = 'n';

    String Jenifer = new String("Jenifer");

    System.out.print(Character.toUpperCase(k));
    System.out.print(Character.toUpperCase(e));
    System.out.print(Character.toUpperCase(v));
    System.out.print(Character.toUpperCase(i));
    System.out.println(Character.toUpperCase(n));
    System.out.println("Jenifer' s name: " + Jenifer.toUpperCase());


    String s1 = "This is a string!";
    String s2 = new String("This is an other string");
    System.out.println(s1);
    System.out.println(s2);

    char[] chars = {'H','E','L','L','O'};
    String s3 = new String(chars);
    System.out.println(s3);

    char[] chars2 = s3.toCharArray();
    for(char c:chars2){
      System.out.println(c);
    }

    int intValue = 43;
    String fromInt = Integer.toString(intValue);
    System.out.println("fromInt: "+fromInt);

    boolean boolValue = true;
    String fromBool = Boolean.toString(boolValue);
    System.out.println(fromBool);


    long longValue = 100_000_000;
    NumberFormat formatter = NumberFormat.getNumberInstance();
    String formatted = formatter.format(longValue);
    System.out.println(formatted);
  }
}
