package com.tmosest.competitiveprogramming.leetcode.easy;

class FixedPoint {

  /**
   * Determine if a value is the same as an index.
   *
   * @param arr The array of values.
   * @return -1 if no value is equal to its index.
   */
  int fixedPoint(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (i == arr[i]) {
        return i;
      }
    }
    return -1;
  }
}
