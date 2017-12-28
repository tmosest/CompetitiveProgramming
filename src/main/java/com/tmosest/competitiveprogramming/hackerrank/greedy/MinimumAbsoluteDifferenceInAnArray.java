package com.tmosest.competitiveprogramming.hackerrank.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifferenceInAnArray {

  /**
   * Determines minimum absolute difference in a array.
   * 
   * @return Returns the minimum absolute difference as a long integer.
   */
  public static long solve() {
    Scanner in = new Scanner(System.in);

    int size = in.nextInt();

    long[] array = new long[size];

    for (int i = 0; i < size; i++) {
      array[i] = in.nextLong();
    }

    in.close();

    Arrays.sort(array);

    long minimum = Long.MAX_VALUE;

    for (int i = 0; i < size - 1; i++) {
      long difference = Math.abs(array[i + 1] - array[i]);
      minimum = (difference < minimum) ? difference : minimum;
    }

    System.out.println(minimum);

    return minimum;
  }

  public static void main(String[] args) {
    solve();
  }

}
