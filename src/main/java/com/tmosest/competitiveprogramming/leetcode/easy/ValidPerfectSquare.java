package com.tmosest.competitiveprogramming.leetcode.easy;

class ValidPerfectSquare {
  /* Write code here. */

  /**
   * Function to determine if a number is a perfect square or not.
   *
   * @param num The number to check.
   * @return True if it is a perfect square.
   */
  public boolean isPerfectSquare(int num) {
    if (num == Integer.MAX_VALUE) {
      return false;
    }
    int index = 1;
    int pow = 1;
    while (pow <= num) {
      if (pow == num) {
        return true;
      }
      pow = ++index * index;
    }
    return false;
  }


}
