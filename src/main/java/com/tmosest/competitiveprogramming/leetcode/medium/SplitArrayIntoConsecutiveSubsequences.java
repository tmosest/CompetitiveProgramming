package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class SplitArrayIntoConsecutiveSubsequences {

  boolean isPossible(int[] nums) {
    if (nums == null || nums.length == 0) {
      return false;
    }

    Map<Integer, Integer> frequencyMap = new HashMap<>();
    Map<Integer, Integer> nextMap = new HashMap<>();

    for (int e : nums) {
      frequencyMap.merge(e, 1, Integer::sum);
    }

    for (int e : nums) {
      Integer count = frequencyMap.get(e);

      if (count == null) {
        return false;
      }
      if (count == 0) {
        continue;
      }

      Integer demand = nextMap.get(e);

      if (demand != null && demand > 0) {
        nextMap.put(e, demand - 1);
        nextMap.merge(e + 1, 1, Integer::sum);
      } else if (demand == null || demand == 0) {
        int nextOne = frequencyMap.getOrDefault(e + 1, 0);
        int nextTwo = frequencyMap.getOrDefault(e + 2, 0);

        if (nextOne > 0 && nextTwo > 0) {
          frequencyMap.put(e + 1, nextOne - 1);
          frequencyMap.put(e + 2, nextTwo - 1);
          nextMap.merge(e + 3, 1, Integer::sum); // Create a new demand
        } else {
          return false;
        }
      }
      frequencyMap
          .put(e, count - 1);
    }
    return true;
  }
}
