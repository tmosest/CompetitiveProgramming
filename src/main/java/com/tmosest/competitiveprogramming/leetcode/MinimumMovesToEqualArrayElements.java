package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {

  /**
   * Determine the number min of moves to make the array equal.
   * @param nums The array of interger.
   * @return Number of increments of two numbers.
   */
  public int minMoves(int[] nums) {
    Arrays.sort(nums);
    int count = 0;
    for (int i = nums.length - 1; i > 0; i--) {
      count += nums[i] - nums[0];
    }
    return count;
  }
}
