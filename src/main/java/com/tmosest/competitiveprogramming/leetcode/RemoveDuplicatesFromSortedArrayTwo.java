package com.tmosest.competitiveprogramming.leetcode;

import java.util.Map;
import java.util.TreeMap;

class RemoveDuplicatesFromSortedArrayTwo {

  /**
   * Take a sorted array and remove dupes of more than two.
   * @param nums The array of numbers.
   * @return A sorted array with dupes removed.
   */
  int removeDuplicates(int[] nums) {
    Map<Integer, Integer> map = new TreeMap<>();
    for (int num : nums) {
      int count = map.getOrDefault(num, 0);
      map.put(num, count + 1);
    }
    int index = 0;
    for (int num : map.keySet()) {
      int count = map.getOrDefault(num, 0);
      for (int i = 0; i < Math.min(count, 2); i++) {
        nums[index++] = num;
      }
    }
    return index;
  }
}
