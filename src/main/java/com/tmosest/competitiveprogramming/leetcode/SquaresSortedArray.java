package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;

public class SquaresSortedArray {

  /**
   * Funtion to square and sort every number.
   * @param nums Array of numbers.
   * @return The sorted squared array.
   */
  public int[] sortedSquares(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] = nums[i] * nums[i];
    }
    Arrays.sort(nums);
    return nums;
  }
}
