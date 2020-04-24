package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class DivideArrayInSetsOfConsecutiveNumbers {

  boolean isPossibleDivide(int[] nums, int count) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int e : nums) {
      map.merge(e, 1, Integer::sum);
    }

    Arrays.sort(nums);

    for (int entry : nums) {
      if (!map.containsKey(entry)) {
        continue;
      }

      for (int j = 0; j < count; j++) {
        if (map.getOrDefault(entry + j, 0) > 0) {
          map.merge(entry + j, -1, Integer::sum);
          if (map.get(entry + j) == 0) {
            map.remove(entry + j);
          }
        } else {
          return false;
        }
      }
    }
    return map.isEmpty();
  }
}
