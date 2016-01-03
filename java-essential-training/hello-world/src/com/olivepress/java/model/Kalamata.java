package com.olivepress.java.model;

/**
 * Created by kevin on 03/01/16.
 */
public class Kalamata extends Olive {

  public Kalamata(){
    super(OliveName.KALAMATA,OliveColor.PURLPLE,2);
  }

  @Override
  public String getOrigin() {
    return "Greece";
  }

}
