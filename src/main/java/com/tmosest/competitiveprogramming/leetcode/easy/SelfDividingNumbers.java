package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class SelfDividingNumbers {
  /* Write code here. */

  /**
   * Find all the self diving numbers in the interval [left, right].
   *
   * @param left The left bound.
   * @param right The right bound.
   * @return A list of self diving numbers.
   */
  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> result = new ArrayList<>();
    for (int i = left; i <= right; i++) {
      if (isSelfDivingNumber(i)) {
        result.add(i);
      }
    }
    return result;
  }

  private boolean isSelfDivingNumber(int num) {
    int numCopy = num;
    while (numCopy > 0) {
      int digit = numCopy % 10;
      if (digit == 0 || num % digit != 0) {
        return false;
      }
      numCopy /= 10;
    }
    return true;
  }


}
