package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;

class ReorderedPowerOfTwo {

  /**
   * Determine if the number can be rearranged to a power of two.
   * @param num The number.
   * @return True if it can be rearranged into a power of two.
   */
  boolean reorderedPowerOf2(int num) {
    int[] arr = count(num);
    for (int i = 0; i < 31; i++) {
      if (Arrays.equals(arr, count(1 << i))) {
        return true;
      }
    }
    return false;
  }

  private int[] count(int num) {
    int[] result = new int[10];
    while (num > 0) {
      result[num % 10]++;
      num /= 10;
    }
    return result;
  }
}
