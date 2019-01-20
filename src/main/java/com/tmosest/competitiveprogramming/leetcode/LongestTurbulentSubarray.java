package com.tmosest.competitiveprogramming.leetcode;

public class LongestTurbulentSubarray {

  private int countTurbulence(int[] nums, int start, boolean forward) {
    int count = 0;
    for (int i = start; i < nums.length - 2; i += 2) {
      if (forward) {
        if (nums[i] < nums[i + 1] && nums[i + 1] > nums[i + 2]) {
          if (count > 0) {
            count += 3;
          } else {
            count += 2;
          }
        } else {
          return count;
        }
      } else {
        if (nums[i] > nums[i + 1] && nums[i + 1] < nums[i + 2]) {
          if (count > 0) {
            count += 3;
          } else {
            count += 2;
          }
        } else {
          return count;
        }
      }
    }
    return count;
  }

  /**
   * Function to determine the longest turbulent sub array.
   * @param nums An array of integers.
   * @return The length of the longest.
   */
  public int maxTurbulenceSize(int[] nums) {
    if (nums.length < 2) {
      return nums.length;
    }
    int result = 2;
    for (int i = 0; i < nums.length - 2; i++) {
      int max = Math.max(
          countTurbulence(nums, i, true),
          countTurbulence(nums, i, false)
      );
      result = Math.max(result, max);
    }
    return result;
  }
}
