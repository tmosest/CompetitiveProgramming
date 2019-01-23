package com.tmosest.competitiveprogramming.leetcode;

public class SmallestRangeOne {

  /**
   * Find the smallest range after...
   * @param nums An array of numbers.
   * @param val The val range we can add from.
   * @return The smallest difference between max and min.
   */
  public int smallestRangeI(int[] nums, int val) {
    int min = nums[0];
    int max = nums[0];
    for (int x : nums) {
      min = Math.min(min, x);
      max = Math.max(max, x);
    }
    return Math.max(0, max - min - 2 * val);
  }
}
