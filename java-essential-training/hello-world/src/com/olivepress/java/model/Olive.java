package com.olivepress.java.model;

/**
 * Created by kevin on 02/01/16.
 */
public abstract class Olive {

// Moved to OliveName Class
//  public static final String KALAMATA = "Kalamata";
//  public static final String LIGURIAN = "Ligurian";

  private OliveName name = OliveName.KALAMATA;
  private OliveColor color = OliveColor.PURLPLE;
  private int oil = 3;


  //constructor method
  public Olive(){}


  //constructor method
  public Olive(OliveName name,OliveColor color,int oil){
    this.name = name;
    this.color = color;
    this.oil = oil;
  }


  public OliveName getName() {
    return name;
  }

  public void setName(OliveName name) {
    this.name = name;
  }

  public OliveColor getColor() {
    return color;
  }

  public void setColor(OliveColor color) {
    this.color = color;
  }

  public int getOil() {
    return oil;
  }

  public void setOil(int oil) {
    this.oil = oil;
  }

  public int crush(){
    String msg = name + ", from "+ getOrigin() + ": " + oil + "units";
    System.out.println(msg);
    return oil;
  }

  public abstract String getOrigin();

  @Override
  public String toString(){return name.toString();}
}
