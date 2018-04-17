package com.tmosest.competitiveprogramming.hackerrank.warmup;

import java.util.Scanner;

public class SolveMeFirst {

  private static int solveMeFirst(int one, int two) {
    return one + two;
  }

  /**
   * Computes the sum of two numbers.
   * 
   * @return Returns the sum of two integers.
   */
  public static int solve() {
    Scanner in = new Scanner(System.in);
    int one = in.nextInt();
    int two = in.nextInt();
    in.close();
    int sum = solveMeFirst(one, two);
    System.out.println(sum);
    return sum;
  }

  public static void main(String[] args) {
    solve();
  }

}
