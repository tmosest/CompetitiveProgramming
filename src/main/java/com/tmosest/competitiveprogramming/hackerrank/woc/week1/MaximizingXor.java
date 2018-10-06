package com.tmosest.competitiveprogramming.hackerrank.woc.week1;

import java.util.Scanner;

/**
 * Given a lower and upper bound the goal is to find the maximum XOR of all given numbers.
 * In Java we use the ^ sign to compute the XOR of two given numbers.
 *
 *   (decimal)    (binary)
 *       5     =  101
 *       6     =  110
 *   ------------------ xor
 *       3     =  011
 *
 *     ^ | 0 1      ^ | F T
 *    --+-----     --+-----
 *     0 | 0 1      F | F T
 *     1 | 1 0      T | T F
 *
 *
 * https://stackoverflow.com/questions/1991380/what-does-the-operator-do-in-java
 *
 * https://www.hackerrank.com/contests/w1/challenges/maximizing-xor
 * 20 points
 */
public class MaximizingXor {
  public static boolean debugMode = false;

  /**
   * Perform a double for loop over the two bounds and try to find the max.
   * Takes O(n^2) where n is upperBound - lowerBound
   * @param lowerBound lower bounds of the range of numbers.
   * @param upperBound upper bounds of the range of numbers.
   * @return The Maximum XOR within the range.
   */
  private static int maximizeXorBrute(int lowerBound, int upperBound) {
    int max = lowerBound ^ upperBound;
    for (int l = lowerBound; l <= upperBound; l++) {
      for (int u = lowerBound; u <= upperBound; u++) {
        max = Math.max(max, l ^ u);
        if (debugMode) {
          System.out.println("l: " + l + " u: " + u + " max: " + max);
        }
      }
    }
    return max;
  }

  public static int solve() {
    Scanner in = new Scanner(System.in);
    int lowerBound = in.nextInt();
    int upperBound = in.nextInt();
    if (debugMode) {
      System.out.println(lowerBound + " <= x <= " + upperBound);
    }
    return maximizeXorBrute(lowerBound, upperBound);
  }

  public static void main(String[] args) {System.out.println(solve());}
}
