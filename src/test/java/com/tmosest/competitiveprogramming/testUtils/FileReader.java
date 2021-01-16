package com.tmosest.competitiveprogramming.testUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public enum FileReader {

  INSTANCE;

  public int[] readInts(String filePath) throws IOException {
    ClassLoader classLoader = this.getClass().getClassLoader();
    File file = new File(classLoader.getResource(filePath).getFile());
    Scanner scanner = new Scanner(file);
    List<Integer> list = new ArrayList<>();

    while(scanner.hasNextInt()){
      list.add(scanner.nextInt());
    }

    return list.stream().mapToInt(num -> (int) num).toArray();
  }
}
