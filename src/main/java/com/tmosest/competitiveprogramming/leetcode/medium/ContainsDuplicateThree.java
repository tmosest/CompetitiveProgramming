package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Map;
import java.util.TreeMap;

class ContainsDuplicateThree {

  boolean containsNearbyAlmostDuplicate(int[] nums, int count, int time) {
    if (count < 0 || time < 0) {
      return false;
    }

    TreeMap<Integer, Integer> map = new TreeMap<>();

    for (int i = 0; i < nums.length; ++i) {
      int max = (nums[i] > 0 && (nums[i] + time) <= 0) ? Integer.MAX_VALUE : nums[i] + time;
      int min = (nums[i] < 0 && (nums[i] - time) >= 0) ? Integer.MIN_VALUE : nums[i] - time;

      Map<Integer, Integer> subTree = map.subMap(min, true, max, true);
      if (!subTree.isEmpty()) {
        for (Integer index : subTree.values()) {
          if (Math.abs(index - i) <= count) {
            return true;
          }
        }
        map.put(nums[i], i);
      } else {
        map.put(nums[i], i);
      }
    }

    return false;
  }
}
