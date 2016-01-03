package com.example.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by kevin on 03/01/16.
 */
public class CopyFile {
  public static void main(String[] args){
    String sourceFile = "hello-world/files/loremipsum.txt";
    String targetFile = "hello-world/files/illiad.txt";

    //print absolute path
    System.out.println(new File(".").getAbsoluteFile());
    try(
            FileReader fReader = new FileReader(sourceFile);
            BufferedReader bReader = new BufferedReader(fReader);
            FileWriter writer = new FileWriter(targetFile)
    ) {
      while(true){
        String line = bReader.readLine();
        if(line == null){
          break;
        }else{
          writer.write(line + "\n");
        }
      }
      System.out.println("File copied");
    }catch (Exception e){
      e.printStackTrace();
    }
  }
}
