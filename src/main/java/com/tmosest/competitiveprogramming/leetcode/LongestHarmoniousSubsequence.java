package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;

public class LongestHarmoniousSubsequence {

  /**
   * Find longest sub-array that is harmonious sub-sequence.
   * @param nums An array of integers.
   * @return The length of the longest.
   */
  public int findLongest(int[] nums) {
    Arrays.sort(nums);
    int prevCount = 1;
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
      int count = 1;
      if (i > 0 && nums[i] - nums[i - 1] == 1) {
        while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
          count++;
          i++;
        }
        res = Math.max(res, count + prevCount);
        prevCount = count;
      } else {
        while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
          count++;
          i++;
        }
        prevCount = count;
      }
    }
    return res;
  }
}
