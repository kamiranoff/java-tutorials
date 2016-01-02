package com.example.java;

/**
 * Created by kevin on 02/01/16.
 */
public class Loops {

  static String[] months ={"January","February","March","April","May","June","July","August","September",
          "October","November","December"};

  public static void main(String[] args){

//    for(int i = months.length -1;i >= 0; i-- ){
//      System.out.println(months[i]);
//    }
//
//    for(String month : months){
//      System.out.println(month);
//    }
//
//    int counter = 0;
//    while (counter< months.length){
//      System.out.println(months[counter]);
//      counter++;
//    }
//
//    int counterDo = 0;
//    do{
//      System.out.println(months[counterDo]);
//      counterDo++;
//    } while (counterDo < months.length);
//

    loopIt("Months");
    loopIt("Second Run");
    loopIt("Months of the year");
  }

  static void loopIt(String label){
    for(int i = 0;i<label.length(); i++){
      System.out.print("*");
    }
    System.out.println("");
    System.out.println(label);
    for(int i = 0;i<label.length(); i++){
      System.out.print("*");
    }
    System.out.println("");

    for(int i = 0; i<months.length;i++){
      System.out.println(months[i]);
    }
  }
}
