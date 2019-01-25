package com.tmosest.competitiveprogramming.leetcode;

public class LongestContinuousIncreasingSubsequence {

  /**
   * Finds the length of the longest continuous increasing sub-sequence.
   * @param nums An array of integers.
   * @return The length.
   */
  public int findLengthOfLcis(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int anchor = 0;
    int max = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] >= nums[i]) {
        anchor = i;
      }
      max = Math.max(max, i - anchor + 1);
    }
    return max;
  }
}
