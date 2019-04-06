package com.tmosest.competitiveprogramming.codejam.jam2019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class YouCanGoAllTheWay {
  /**
   * Determine a unique path.
   * @param pathToAvoid Path to avoid.
   * @param length The size of the board.
   * @return A unique path to the end.
   */
  public static String getUniquePath(String pathToAvoid, int length) {
    StringBuilder result = new StringBuilder();
    for (char letter : pathToAvoid.toCharArray()) {
      if (letter == 'E') {
        result.append('S');
      } else {
        result.append('E');
      }
    }
    return result.toString();
  }

  /**
   * Read from input and solve.
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int tests = Integer.parseInt(in.nextLine());
    for (int i = 1; i <= tests; ++i) {
      int length = Integer.parseInt(in.nextLine());
      String path = in.nextLine();
      System.out.println("Case #" + i + ": " + getUniquePath(path, length));
    }
  }
}
