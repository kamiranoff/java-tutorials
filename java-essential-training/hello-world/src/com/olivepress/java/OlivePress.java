package com.olivepress.java;

import com.olivepress.java.model.Olive;

import java.util.List;

/**
 * Created by kevin on 02/01/16.
 */
public class OlivePress implements Press {

  private int currentOil;


  public int getOil(List<Olive> olives){

    int totalOil = currentOil;

    for (Olive o:olives){
      System.out.println(o.getName());
      System.out.println("Oil added: "+o.crush());
      totalOil += o.crush();
    }

    return totalOil;
  }

  @Override
  public void setOil(int oil) {
    currentOil = oil;
  }
}
