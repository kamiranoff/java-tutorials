package com.example.java;

import java.lang.StringBuilder;

/**
 * Created by kevin on 02/01/16.
 */
public class MultiArrays {
  public static void main(String[] args){
    String[][] states = new String[3][2];
    states[0][0] = "California";
    states[0][1] = "Sacramento";
    states[1][0] = "Oregon";
    states[1][1] = "Salem";
    states[2][0] = "Washington";
    states[2][1] = "Olympia";

    System.out.println(states);
    for (int i = 0; i < states.length ; i++) {
     StringBuilder sb = new StringBuilder();

      sb.append("The capital of ")
              .append(states[i][0])
              .append(" is ")
              .append(states[i][1])
              .append(" ");
      System.out.println(sb);
    }

  }
}
