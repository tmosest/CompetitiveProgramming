package com.tmosest.competitiveprogramming.leetcode.easy;

class PerfectNumber {
  /* Write code here. */

  /**
   * Determines if a number is the sum of its divisors less than itself.
   *
   * @param num The number to check if perfect.
   * @return True if the number is perfect and false otherwise.
   */
  public boolean checkPerfectNumber(int num) {
    if (num < 2) {
      return false;
    }

    int sum = 1;

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }

    return sum == num;
  }


}
