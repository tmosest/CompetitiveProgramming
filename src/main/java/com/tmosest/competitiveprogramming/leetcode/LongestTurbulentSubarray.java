package com.tmosest.competitiveprogramming.leetcode;

public class LongestTurbulentSubarray {

  /**
   * Function to determine the longest turbulent sub array.
   * @param nums An array of integers.
   * @return The length of the longest.
   */
  public int maxTurbulenceSize(int[] nums) {
    int length = nums.length;
    int result = 1;
    int anchor = 0;

    for (int i = 1; i < length; i++) {
      int compare = Integer.compare(nums[i - 1], nums[i]);
      if (i == length - 1 || compare * Integer.compare(nums[i], nums[i + 1]) != -1) {
        result = Math.max(result, i - anchor + 1);
        anchor = i;
      }
    }

    return result;
  }
}
