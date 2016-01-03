package com.example.java;

import java.util.Scanner;


/**
 * Created by kevin on 02/01/16.
 */
public class Challenge2 {
  public static void main(String[] args){
    String inputValue1,inputValue2,operatorInput;
    Scanner sc = new Scanner(System.in);
    double result,numericInput1,numericInput2;



    System.out.print("Enter a numeric value: ");
    inputValue1 = sc.nextLine();

    System.out.print("Enter a numeric value: ");
    inputValue2 = sc.nextLine();

    System.out.print("Choose an operation: ");
    operatorInput = sc.nextLine();

    try {
      if(!isNumeric(inputValue1)){
        throw (new Exception("Not a numeric value"));
      }else{
         numericInput1 = Double.parseDouble(inputValue1);
      }

      if(!isNumeric(inputValue2)){
        throw (new Exception("Not a numeric value"));
      }else{
        numericInput2 = Double.parseDouble(inputValue2);
      }

      switch (operatorInput) {
        case "+":
          result = numericInput1 + numericInput2;
          break;
        case "-":
          result = numericInput1 - numericInput2;
          break;
        case "/":
          result = numericInput1 / numericInput2;
          break;
        case "*":
          result = numericInput1 * numericInput2;
          break;
        default:
          throw (new Exception("Not a good operation"));

      }

      System.out.println(result);

    }catch (Exception e){
      System.out.println(e.getMessage());
    }



  }

  static boolean isNumeric(String str){
    try{
      double d = Double.parseDouble(str);

    }catch (NumberFormatException e){
      return false;
    }
    return true;
  }
}
