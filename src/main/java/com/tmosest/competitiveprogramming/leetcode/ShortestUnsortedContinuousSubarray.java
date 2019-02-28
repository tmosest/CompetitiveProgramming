package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {

  /**
   * Find the length of the shortest continuous sub array that would need to be sorted.
   * @param nums An array of numbers.
   * @return The length.
   */
  public int findUnsortedSubarray(int[] nums) {
    int[] snums = nums.clone();
    Arrays.sort(snums);
    int start = snums.length;
    int end = 0;
    for (int i = 0; i < snums.length; i++) {
      if (snums[i] != nums[i]) {
        start = Math.min(start, i);
        end = Math.max(end, i);
      }
    }
    return (end - start >= 0 ? end - start + 1 : 0);
  }
}
