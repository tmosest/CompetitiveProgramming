package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashSet;
import java.util.Set;

public class KdiffPairsInAnArray {

  /**
   * Finds size pairs.
   * @param nums The array of numbers.
   * @param size The size of the pairs.
   * @return The number.
   */
  public int findPairs(int[] nums, int size) {
    if (size < 0) {
      return 0;
    }
    Set<Integer> set = new HashSet<>();
    Set<Integer> dupSet = new HashSet<>();
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (size == 0) {
        if (set.contains(nums[i]) && !dupSet.contains(nums[i])) {
          count++;
          dupSet.add(nums[i]);
        }
      }
      set.add(nums[i]);
    }
    if (size == 0) {
      return count;
    }
    for (int i: set) {
      if (set.contains(i + size)) {
        count++;
      }
      if (set.contains(i - size)) {
        count++;
      }
    }
    return count / 2;
  }
}
