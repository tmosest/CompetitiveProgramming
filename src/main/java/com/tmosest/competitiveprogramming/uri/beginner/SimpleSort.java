package com.tmosest.competitiveprogramming.uri.beginner;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleSort {

  public static boolean debugMode = false;

  /**
   * Test function.
   *
   * @return String result.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    int[] array = new int[3];
    int[] sorted = new int[3];
    for (int i = 0; i < 3; i++) {
      array[i] = in.nextInt();
      sorted[i] = array[i];
    }
    Arrays.sort(sorted);
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < 3; i++) {
      stringBuilder.append(sorted[i] + "\n");
    }
    stringBuilder.append("\n");
    for (int i = 0; i < 3; i++) {
      stringBuilder.append(array[i] + "\n");
    }
    in.close();
    return stringBuilder.toString();
  }

  /**
   * Main function.
   *
   * @param args String array.
   */
  public static void main(String[] args) {
    System.out.print(solve());
  }

}
