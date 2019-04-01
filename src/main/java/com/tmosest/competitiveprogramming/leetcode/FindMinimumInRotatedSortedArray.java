package com.tmosest.competitiveprogramming.leetcode;

public class FindMinimumInRotatedSortedArray {

  /**
   * Find the minimum in a sorted array that has a pivot point.
   * Should use binary search but this linear solution passes.
   * @param nums The numbers.
   * @return The minimum element.
   */
  public int findMin(int[] nums) {
    int min = Integer.MAX_VALUE;
    for (int num : nums) {
      min = Math.min(min, num);
    }
    return min;
  }
}
