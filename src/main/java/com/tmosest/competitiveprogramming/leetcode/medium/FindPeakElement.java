package com.tmosest.competitiveprogramming.leetcode.medium;

class FindPeakElement {

  /**
   * Find a peek element.
   *
   * @param nums Array of numbers.
   * @return Index for peak element.
   */
  public int findPeakElement(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        return i;
      }
    }
    return nums.length - 1;
  }
}
