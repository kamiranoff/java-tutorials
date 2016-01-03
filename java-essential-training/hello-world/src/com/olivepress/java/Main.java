package com.olivepress.java;

import com.olivepress.java.model.Kalamata;
import com.olivepress.java.model.Ligurian;
import com.olivepress.java.model.Olive;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 02/01/16.
 * This is an <strong>olive press</strong> application, and its job is to <em>prss olives</em>!
 */
public class Main {

  /**
   * The main method
   * @param args - an array of String values
   */
  public static void  main(String[] args){

    List<Olive> olives = new ArrayList<>();

    olives.add(new Kalamata());
    olives.add(new Kalamata());
    olives.add(new Ligurian());
    olives.add(new Ligurian());
    olives.add(new Ligurian());
    olives.add(new Ligurian());
    olives.add(new Ligurian());
    olives.add(new Ligurian());

    //use of interface
    Press press = new OlivePress();
    press.setOil(5);
    int totalOil = press.getOil(olives);
    System.out.println("Total olive oil: " +totalOil);

//    Press p2 = new Press() {
//      @Override
//      public int getOil(List<Olive> olives) {
//        return 0;
//      }
//
//      @Override
//      public void setOil(int oil) {
//
//      }
//    }
  }
}
