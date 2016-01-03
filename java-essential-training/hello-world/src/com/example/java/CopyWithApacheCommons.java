package com.example.java;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by kevin on 03/01/16.
 */
public class CopyWithApacheCommons {
  public  static void main(String[] args){
    File sourceFile = new File("hello-world/files", "loremipsum.txt");
    File targetFile = new File("hello-world/files","illiad.txt");

    try {
      FileUtils.copyFile(sourceFile,targetFile);
      System.out.println("File copied");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
