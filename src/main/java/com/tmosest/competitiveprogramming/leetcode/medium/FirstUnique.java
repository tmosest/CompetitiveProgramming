package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class FirstUnique {

  private Map<Integer, Integer> counts;
  private List<Integer> uniqueQueue;
  private Set<Integer> uniqueValues;

  FirstUnique(int[] nums) {
    counts = new HashMap<>();
    uniqueQueue = new ArrayList<>();
    uniqueValues = new HashSet<>();

    for (int num : nums) {
      this.add(num);
    }
  }

  int showFirstUnique() {
    if (uniqueQueue.size() > 0) {
      return uniqueQueue.get(0);
    }

    return -1;
  }

  void add(int value) {
    int count = counts.getOrDefault(value, 0);
    count += 1;
    counts.put(value, count);

    if (count == 1) {
      uniqueQueue.add(value);
      uniqueValues.add(value);
    } else if (uniqueValues.contains(value)) {
      Integer val = Integer.valueOf(value);
      uniqueQueue.remove(val);
      uniqueValues.remove(val);
    }
  }
}
