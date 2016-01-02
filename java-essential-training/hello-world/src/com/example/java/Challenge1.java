package com.example.java;

import java.util.Scanner;

/**
 * Created by kevin on 02/01/16.
 */

public class Challenge1 {
  public static void main(String[] args){
    double userInput1,userInput2;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a numeric value: ");
    userInput1 = scanner.nextDouble();
    System.out.print("Enter a numeric value: ");
    userInput2 = scanner.nextDouble();

    double result = userInput1 + userInput2;
    System.out.println("The answer is: " +result);
  }
}
