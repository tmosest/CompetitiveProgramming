package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;

class UniqueNumberOfOccurrences {

  boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int val : arr) {
      int count = map.getOrDefault(val, 0) + 1;
      map.put(val, count);
    }
    HashSet<Integer> set = new HashSet<>();
    for (int val : map.values()) {
      if (set.contains(val)) {
        return false;
      }
      set.add(val);
    }
    return true;
  }
}
