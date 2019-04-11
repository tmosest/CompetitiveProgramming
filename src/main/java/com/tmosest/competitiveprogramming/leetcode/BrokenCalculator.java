package com.tmosest.competitiveprogramming.leetcode;

public class BrokenCalculator {

  /**
   * Determine number of moves needed on a broken calculator.
   * Can double or subtract by one.
   * @param start The start point.
   * @param end The end point.
   * @return The min number of moves.
   */
  public int brokenCalc(int start, int end) {
    int ans = 0;
    while (end > start) {
      ans++;
      if (end % 2 == 1) {
        end++;
      } else {
        end /= 2;
      }
    }
    return ans + start - end;
  }
}
