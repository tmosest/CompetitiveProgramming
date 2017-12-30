package com.tmosest.competitiveprogramming.hackerearth.datastructures.stacks;

import java.util.Arrays;
import java.util.Scanner;

public class MonkAndPrisonerOfAzkaban {

  public static boolean debugMode = false;

  /**
   * Function to test.
   *
   * @return Array of x + y's
   */
  public static long[] solve() {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    long[] results = new long[size];
    long[] array = new long[size];
    for (int i = 0; i < size; i++) {
      array[i] = in.nextLong();
    }
    for (int i = 0; i < size; i++) {
      long value = array[i];
      long leftValue = -1;
      for (int l = i - 1; l >= 0; l--) {
        if (array[l] > value) {
          leftValue = l + 1;
          break;
        }
      }
      long rightValue = -1;
      for (int r = i + 1; r < size; r++) {
        if (array[r] > value) {
          rightValue = r + 1;
          break;
        }
      }
      if(debugMode) {
        System.out.println("i: " + i + " left: " + leftValue + " right: " + rightValue);
      }
      results[i] = leftValue + rightValue;
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach((i) -> {
      System.out.print(i + " ");
    });
  }
}
