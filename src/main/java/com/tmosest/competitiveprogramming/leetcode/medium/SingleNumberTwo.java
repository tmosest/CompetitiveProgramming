package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class SingleNumberTwo {

  /**
   * Numbers appear in 3's except one.
   *
   * @param nums The numbers.
   * @return The one that appears only once.
   */
  int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      int count = map.getOrDefault(num, 0);
      map.put(num, count + 1);
    }
    for (int key : map.keySet()) {
      if (map.get(key) != 3) {
        return key;
      }
    }
    return -1;
  }
}
