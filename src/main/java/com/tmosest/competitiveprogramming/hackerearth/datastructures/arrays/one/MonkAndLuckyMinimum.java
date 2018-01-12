package com.tmosest.competitiveprogramming.hackerearth.datastructures.arrays.one;

import java.util.Arrays;
import java.util.Scanner;

public class MonkAndLuckyMinimum {

  public static boolean debugMode = false;

  private static String luckyArrays(int[] ar) {
    Arrays.sort(ar);
    int minCount = 1;
    int min = ar[0];
    for (int i = 1; i < ar.length; i++) {
      if (ar[i] != min) {
        break;
      }
      minCount++;
    }
    return (minCount % 2 == 0) ? "Unlucky" : "Lucky";
  }

  /**
   * Function for testing.
   *
   * @return String Array
   */
  public static String[] solve() {
    Scanner sc = new Scanner(System.in);
    int tests = sc.nextInt();
    String[] results = new String[tests];
    for (int t = 0; t < tests; t++) {
      int arraySize = sc.nextInt();
      int[] array = new int[arraySize];
      for (int i = 0; i < arraySize; i++) {
        array[i] = sc.nextInt();
      }
      results[t] = luckyArrays(array);
    }
    return results;
  }

  /**
   * Main function.
   *
   * @param args Main String arrays.
   */
  public static void main(String[] args) {
    String[] results = solve();
    for (int r = 0; r < results.length; r++) {
      System.out.println(results[r]);
    }
  }
}
