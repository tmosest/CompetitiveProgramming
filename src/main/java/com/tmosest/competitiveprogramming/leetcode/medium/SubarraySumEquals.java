package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;

class SubarraySumEquals {
  /* Write code here. */

  /**
   * Finds the number of continuous sub-arrays that sum to the partial sum.
   *
   * @param nums The integers in the array.
   * @param partialSum The partial sum we are looking for.
   * @return The number of continuous sub-arrays that sum to the given sum.
   */
  public int subarraySum(int[] nums, int partialSum) {
    int count = 0;
    int sum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for (int num : nums) {
      sum += num;
      if (map.containsKey(sum - partialSum)) {
        count += map.get(sum - partialSum);
      }
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return count;
  }


}
