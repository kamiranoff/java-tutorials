package com.olivepress.java.model;

/**
 * Created by kevin on 03/01/16.
 */
public class Ligurian extends Olive {

  public Ligurian(){
    super(OliveName.LIGURIAN,OliveColor.BLACK,5);
  }

  @Override
  public String getOrigin() {
    return "Italy";
  }

}
