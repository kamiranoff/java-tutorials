package com.example.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kevin on 02/01/16.
 */
public class HashMapClass {

  public static void main(String[] args){
    Map<String,String> map = new HashMap<>();

    map.put("California", "Sacramento");
    map.put("Oregon", "Salem");
    map.put("Washington", "Olympia");
    System.out.println(map);

    map.put("Alaska", "Juneau");

    String cap = map.get("Oregon");
    System.out.println("The capital of Oregon is "+cap);
  }
}
