package com.tmosest.competitiveprogramming.codejam.jam2019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ForgoneSolutions {

  public static class Pair {
    public int one;
    public int two;

    private Pair(int one, int two) {
      this.one = one;
      this.two = two;
    }
  }

  private static boolean containsFour(int num) {
    while (num > 0) {
      int digit = num % 10;
      if (digit == 4) {
        return true;
      }
      num /= 10;
    }
    return false;
  }

  /**
   * Find to numbers that sum to a number but don't have 4's in them.
   * @param checkSize The number to sum to.
   * @return Pair with the two numbers.
   */
  public static Pair getCheckWithOutFours(int checkSize) {
    Pair result = new Pair(checkSize, 0);
    boolean first = containsFour(result.one);
    boolean second = containsFour(result.two);
    while (first || second) {
      if (first) {
        if (result.one % 2 == 0) {
          int half = result.one / 2;
          result.one -= half;
          result.two += half;
        } else {
          result.one--;
          result.two++;
        }
      }
      if (second) {
        if (result.two % 2 == 0) {
          int half = result.two / 2;
          result.two -= half;
          result.one += half;
        } else {
          result.one--;
          result.two++;
        }
      }
      first = containsFour(result.one);
      second = containsFour(result.two);
    }
    return result;
  }


  /**
   * Read from input and solve.
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int tests = in.nextInt();
    for (int i = 1; i <= tests; ++i) {
      int checkSize = in.nextInt();
      Pair result = getCheckWithOutFours(checkSize);
      System.out.println("Case #" + i + ": " + result.one + " " + result.two);
    }
  }
}
