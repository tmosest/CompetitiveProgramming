package com.tmosest.competitiveprogramming.hackerrank.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArraySum {

  /**
   * Sums an array from Scanner.
   * @return Array sum
   */
  public static int solve() {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] array = new int[size];

    for (int i = 0; i < size; i++) {
      array[i] = in.nextInt();
    }

    in.close();

    int sum = Arrays.stream(array).sum();
    System.out.println(sum);
    return sum;
  }

  public static void main(String[] args) {
    solve();
  }

}
