package com.example.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by kevin on 03/01/16.
 */
public class CopyFileNewIo {
  public static void main(String[] args){
    Path sourceFile = Paths.get("hello-world/files", "loremipsum.txt");
    Path targetFile = Paths.get("hello-world/files","illiad.txt");

    try {
      Files.copy(sourceFile,targetFile, StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
