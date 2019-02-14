package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedArray {

  /**
   * Find disappearing number.
   * @param nums Input of numbers.
   * @return List of missing numbers.
   */
  public List<Integer> findDisappearedNumbers(int[] nums) {
    int[] counts = new int[nums.length];
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      counts[nums[i] - 1]++;
    }
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] == 0) {
        result.add(i + 1);
      }
    }
    return result;
  }
}
