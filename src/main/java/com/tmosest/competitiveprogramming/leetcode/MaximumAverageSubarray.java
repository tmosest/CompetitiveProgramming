package com.tmosest.competitiveprogramming.leetcode;

public class MaximumAverageSubarray {

  /**
   * Determine max average of a sub array of size.
   * @param nums The array.
   * @param size The size of the sub-array.
   * @return The max average of that size.
   */
  public double findMaxAverage(int[] nums, int size) {
    double maxAverage = 0;
    double average = 0;

    if (nums.length < size) {
      return maxAverage;
    }

    for (int i = 0; i < size; i++) {
      average += nums[i];
    }

    maxAverage = average;

    for (int i = size; i < nums.length; i++) {
      average += nums[i];
      average -= nums[i - size];
      maxAverage = Math.max(average, maxAverage);
    }

    return maxAverage / size;
  }
}
