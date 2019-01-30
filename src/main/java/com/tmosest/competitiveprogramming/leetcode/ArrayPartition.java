package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;

public class ArrayPartition {

  /**
   * Determine sum(min(nums[i], nums[i + 1]).
   * @param nums Array of integers.
   * @return min pair sum.
   */
  public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int result = 0;
    for (int i = 0; i < nums.length; i += 2) {
      result += nums[i];
    }
    return result;
  }
}
