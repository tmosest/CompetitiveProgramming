package com.tmosest.competitiveprogramming.leetcode.common;

public class NumArray {
  private int[] sum;

  /**
   * Creates a NumArray which is an object used for computing interval sums quicker.
   * @param nums An array of integers.
   */
  public NumArray(int[] nums) {
    sum = new int[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
      sum[i + 1] = sum[i] + nums[i];
    }
  }

  /**
   * Function to get the sum of numbers within the given range.
   * @param first First number.
   * @param second Second number.
   * @return Return the sum between the first and second number.
   */
  public int sumRange(int first, int second) {
    return sum[second + 1] - sum[first];
  }
}
