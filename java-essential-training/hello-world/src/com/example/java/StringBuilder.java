package com.example.java;

import java.util.Scanner;

/**
 * Created by kevin on 01/01/16.
 */
public class StringBuilder {


  public static void main(String[] args){
    String s1 = "Hello";
    String s2 = "World";
    String s3 = s1 + " " + s2;
    System.out.println(s3);

    java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
    sb.append(", ")
      .append("World")
      .append("!");
    System.out.println(sb);

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter value: ");
    String input = scanner.nextLine();
    System.out.println(input);

    sb.delete(0,sb.length());

    for (int i = 0; i < 3 ; i++) {
      input = scanner.nextLine();
      sb.append(input + "\n");
    }
    System.out.println(sb);
  }
}
