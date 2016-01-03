package com.olivepress.java.model;

/**
 * Created by kevin on 02/01/16.
 */
public enum OliveName {
  KALAMATA("Kalamata"),
  LIGURIAN("Ligurian");

  private String name;
  OliveName(String name) {
  this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
