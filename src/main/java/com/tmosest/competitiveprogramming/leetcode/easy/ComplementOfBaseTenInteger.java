package com.tmosest.competitiveprogramming.leetcode.easy;

class ComplementOfBaseTenInteger {
  /* Write code here. */

  /**
   * Determine the bitwise compliment of a number.
   *
   * @param num The number.
   * @return The bitwise compliment.
   */
  public int bitwiseComplement(int num) {
    if (num == 0) {
      return 1;
    }
    int result = 0;
    int pow = 1;
    while (num > 0) {
      if (num % 2 == 0) {
        result += pow;
      }
      pow *= 2;
      num = num >> 1;
    }
    return result;
  }


}
