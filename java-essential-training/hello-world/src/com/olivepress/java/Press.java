package com.olivepress.java;

import com.olivepress.java.model.Olive;

import java.util.List;

/**
 * Created by kevin on 03/01/16.
 */
public interface Press {
  public int getOil(List<Olive> olives);

  public void setOil(int oil);
}
