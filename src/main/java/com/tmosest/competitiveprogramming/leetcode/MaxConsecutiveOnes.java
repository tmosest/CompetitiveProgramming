package com.tmosest.competitiveprogramming.leetcode;

public class MaxConsecutiveOnes {

  /**
   * Find the max consecutive number of ones in a row.
   * @param nums An array of integers.
   * @return Max number of consecutive ones.
   */
  public int findMaxConsecutiveOnes(int[] nums) {
    int max = 0;
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        max = Math.max(max, sum);
        sum = 0;
      } else {
        sum++;
      }
    }

    return Math.max(max, sum);
  }
}
