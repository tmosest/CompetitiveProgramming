package com.tmosest.competitiveprogramming.leetcode.easy;

class IsUgly {
  /* Write code here. */

  /**
   * Function to determine if a number is ugly or not. Aka if all its
   *
   * @param num The input number.
   * @return True if it is ugly.
   */
  public boolean isUgly(int num) {
    if (num == 0) {
      return false;
    }
    while (num % 2 == 0) {
      num /= 2;
    }
    while (num % 3 == 0) {
      num /= 3;
    }
    while (num % 5 == 0) {
      num /= 5;
    }
    return num == 1;
  }


}
