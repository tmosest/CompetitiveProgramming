package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class MaximumProductOfThreeNumbers {
  /* Write code here. */

  /**
   * Determine the product of the three largest numbers.
   *
   * @param nums An array of integers.
   * @return The largest product.
   */
  public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int length = nums.length;
    if (length < 3) {
      return 0;
    }
    return Math.max(
        nums[0] * nums[1] * nums[nums.length - 1],
        nums[length - 1] * nums[length - 2] * nums[length - 3]
    );
  }


}
