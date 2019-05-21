package com.tmosest.competitiveprogramming.leetcode.easy;

class SumOfTwoIntegers {
  /* Write code here. */

  /**
   * Sum two integers without + or -.
   *
   * @param one First int.
   * @param two Second int.
   * @return Return the sum.
   */
  public int getSum(int one, int two) {
    if (two == 0) {
      return one;
    }
    return getSum(one ^ two, (one & two) << 1);
  }


}
