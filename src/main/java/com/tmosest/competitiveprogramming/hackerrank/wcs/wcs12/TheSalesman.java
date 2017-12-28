package com.tmosest.competitiveprogramming.hackerrank.wcs.wcs12;

import java.util.Arrays;
import java.util.Scanner;

public class TheSalesman {
  
  public static boolean debugMode = false;

  private static int findMinimumTime(int[] houses) {
    Arrays.sort(houses);
    return Math.abs(houses[0] - houses[houses.length - 1]);
  }
  
  public static int[] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    int[] testData = new int[tests];
    for(int t = 0; t < tests; t++) {
      int n = in.nextInt();
      int[] houses = new int[n];
      for(int i = 0; i < n; i++)
        houses[i] = in.nextInt();
      testData[t] = findMinimumTime(houses);
    }
    in.close();
    return testData;
  }
  
  public static void main(String[] args) {
    int[] results = solve();
    for(int r = 0; r < results.length; r++)
      System.out.println(results[r]);
  }
  
}
