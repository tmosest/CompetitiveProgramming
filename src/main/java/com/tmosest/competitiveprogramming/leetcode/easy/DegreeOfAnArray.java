package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class DegreeOfAnArray {
  /* Write code here. */

  /**
   * Find the size of the smallest sub array that has the same degree as the whole.
   *
   * @param nums An array of integers.
   * @return Length of smallest contiguous sub-array with the same degree.
   */
  public int findShortestSubArray(int[] nums) {
    Map<Integer, Integer> left = new HashMap<>();
    Map<Integer, Integer> right = new HashMap<>();
    Map<Integer, Integer> count = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      left.putIfAbsent(num, i);
      right.put(num, i);
      count.put(num, count.getOrDefault(num, 0) + 1);
    }

    int ans = nums.length;
    int degree = Collections.max(count.values());
    for (int x : count.keySet()) {
      if (count.get(x) == degree) {
        ans = Math.min(ans, right.get(x) - left.get(x) + 1);
      }
    }
    return ans;
  }


}
