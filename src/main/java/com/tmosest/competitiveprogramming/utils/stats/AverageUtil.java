package com.tmosest.competitiveprogramming.utils.stats;

import java.util.List;

public class AverageUtil {

  /**
   * Find the average of a list of numbers.
   *
   * @param nums The list of numbers.
   * @return The average.
   */
  public static double average(List<Integer> nums) {
    double average = 0;
    int size = nums.size();
    for (Integer val : nums) {
      average += val;
    }
    average /= size;
    return average;
  }
}
