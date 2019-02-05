package com.tmosest.competitiveprogramming.leetcode;

public class BinaryNumberWithAlternatingBits {

  /**
   * Determine if a number if alternating 0's and 1's.
   * @param number The number to check.
   * @return True if it is alternating bits.
   */
  public boolean hasAlternatingBits(int number) {
    int cur = number % 2;
    number /= 2;
    while (number > 0) {
      if (cur == number % 2) {
        return false;
      }
      cur = number % 2;
      number /= 2;
    }
    return true;
  }
}
