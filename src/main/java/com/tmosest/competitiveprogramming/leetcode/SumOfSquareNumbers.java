package com.tmosest.competitiveprogramming.leetcode;

public class SumOfSquareNumbers {

  /**
   * Determine if a number can be written as a sum of squares.
   * @param num The number to look at.
   * @return True if it can be written as a sum of squares.
   */
  public boolean judgeSquareSum(int num) {
    for (long a = 0; a * a <= num; a++) {
      double check = Math.sqrt(num - a * a);
      if (check == (int) check) {
        return true;
      }
    }
    return false;
  }
}
