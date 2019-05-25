package com.tmosest.competitiveprogramming.leetcode.medium;

class DivideTwoIntegers {

  /**
   * Divide two numbers with out using standard operations.
   * @param dividend The dividend.
   * @param divisor The divisor.
   * @return The result of dividend / divisor.
   */
  public int divide(int dividend, int divisor) {
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
      return Integer.MAX_VALUE;
    }
    if (dividend > 0 && divisor > 0) {
      return divideHelper(-dividend, -divisor);
    }
    if (dividend > 0) {
      return -divideHelper(-dividend,divisor);
    }
    if (divisor > 0) {
      return -divideHelper(dividend,-divisor);
    }
    return divideHelper(dividend, divisor);
  }

  private int divideHelper(int dividend, int divisor) {
    // base case
    if (divisor < dividend) {
      return 0;
    }
    // get highest digit of divisor
    int cur = 0;
    int res = 0;
    while ((divisor << cur) >= dividend && divisor << cur < 0 && cur < 31) {
      cur++;
    }
    res = dividend - (divisor << cur - 1);
    if (res > divisor) {
      return 1 << cur - 1;
    }
    return (1 << cur - 1) + divide(res, divisor);
  }
}
