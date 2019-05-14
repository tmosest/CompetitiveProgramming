package com.tmosest.competitiveprogramming.leetcode.easy;

class ValidMountainArray {
  /* Write code here. */

  /**
   * Determines if an array is increasing then decreasing.
   *
   * @param array The array to look through.
   * @return True if it looks like a mountain and false otherwise.
   */
  public boolean validMountainArray(int[] array) {
    boolean shouldBeIncreasing = true;
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        if (i == 0) {
          return false;
        } else {
          shouldBeIncreasing = false;
        }
      } else if (!shouldBeIncreasing && array[i] < array[i + 1]) {
        return false;
      } else if (array[i] == array[i + 1]) {
        return false;
      }
    }
    return !shouldBeIncreasing;
  }


}
