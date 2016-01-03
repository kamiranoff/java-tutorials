package com.example.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 02/01/16.
 */
public class ArrayListClass {
  public static void main(String[] args){
    List<String> list = new ArrayList<>();

    list.add("Paris");
    list.add("California");
    list.add("Oregon");
    list.add("Washington");

    System.out.println(list);

    list.add("Alaska");
    System.out.println(list);

    list.remove(0);
    System.out.println(list);

    String state = list.get(1);
    System.out.println("the second state is "+state);

    int pos = list.indexOf("Alaska");
    System.out.println("Alaska is at "+pos);
  }

}

