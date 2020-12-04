package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class DistributeRepeatingIntegers {

  boolean canDistribute(int[] nums, int[] quantity) {

    Map<Integer, Integer> freq = new HashMap<>();
    for (int num : nums) {
      freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    int[] dist = new int[freq.size()];
    int idx = 0;
    for (int f : freq.values()) {
      dist[idx++] = f;
    }

    Arrays.sort(quantity);
    return rec(dist, quantity, quantity.length - 1);
  }

  private boolean rec(int[] dist, int[] quantity, int index) {

    if (index == -1) {
      return true;
    }

    Set<Integer> used = new HashSet<>();
    for (int i = 0; i < dist.length; ++i) {

      if (dist[i] >= quantity[index] && used.add(dist[i])) {
        dist[i] -= quantity[index];
        if (rec(dist, quantity, index - 1)) {
          return true;
        }
        dist[i] += quantity[index];
      }
    }
    return false;
  }
}
