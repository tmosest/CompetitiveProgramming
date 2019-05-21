package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class ArrayPartition {
  /* Write code here. */

  /**
   * Determine sum(min(nums[i], nums[i + 1]).
   *
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
