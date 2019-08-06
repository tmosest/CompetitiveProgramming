package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class FindAllDuplicatesInAnArray {

  /**
   * Return all elements that appear twice.
   *
   * @param nums The nums.
   * @return A list of those that appear twice.
   */
  List<Integer> findDuplicates(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int val : nums) {
      int count = map.getOrDefault(val, 0);
      map.put(val, count + 1);
    }
    List<Integer> result = new ArrayList<>();
    for (int key : map.keySet()) {
      if (map.get(key) == 2) {
        result.add(key);
      }
    }
    return result;
  }
}
