package com.tmosest.competitiveprogramming.testUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public enum FileReader {

  INSTANCE;

  public int[] readInts(String filePath) throws IOException {
    return this.readLines(filePath).stream().mapToInt(Integer::valueOf).toArray();
  }

  public List<String> readLines(String filePath) throws IOException {
    ClassLoader classLoader = this.getClass().getClassLoader();
    URL url = classLoader.getResource(filePath);
    File file = new File(url.getFile());
    Scanner scanner = new Scanner(file);
    List<String> lines = new ArrayList<>();

    while (scanner.hasNextLine()) {
      lines.add(scanner.nextLine());
    }

    return lines;
  }
}
