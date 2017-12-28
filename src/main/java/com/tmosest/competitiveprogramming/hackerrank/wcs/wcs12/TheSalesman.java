package com.tmosest.competitiveprogramming.hackerrank.wcs.wcs12;

import java.util.Arrays;
import java.util.Scanner;

public class TheSalesman {

  public static boolean debugMode = false;

  private static int findMinimumTime(int[] houses) {
    Arrays.sort(houses);
    return Math.abs(houses[0] - houses[houses.length - 1]);
  }

  /**
   * Function to test the problem.
   *
   * @return int array containing results.
   */
  public static int[] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    int[] testData = new int[tests];
    for (int t = 0; t < tests; t++) {
      int num = in.nextInt();
      int[] houses = new int[num];
      for (int i = 0; i < num; i++) {
        houses[i] = in.nextInt();
      }
      testData[t] = findMinimumTime(houses);
    }
    in.close();
    return testData;
  }

  /**
   * Main function.
   *
   * @param args String array
   */
  public static void main(String[] args) {
    int[] results = solve();
    for (int r = 0; r < results.length; r++) {
      System.out.println(results[r]);
    }
  }

}
