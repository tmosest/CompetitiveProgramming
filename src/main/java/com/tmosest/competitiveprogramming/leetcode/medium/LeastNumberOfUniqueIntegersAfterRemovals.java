package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class LeastNumberOfUniqueIntegersAfterRemovals {

  int findLeastNumOfUniqueInts(int[] arr, int removals) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int a : arr) {
      map.put(a, map.getOrDefault(a, 0) + 1);
    }
    TreeMap<Integer, Integer> tmap = new TreeMap<>();
    for (int v : map.values()) {
      tmap.put(v, tmap.getOrDefault(v, 0) + 1);
    }
    int count = map.size();
    while (removals > 0 && !tmap.isEmpty()) {
      int len = tmap.firstKey();
      for (int i = 0; i < tmap.get(len); i++) {
        removals -= len;
        if (removals >= 0) {
          count--;
        } else {
          return count;
        }
      }
      tmap.remove(len);
    }
    return count;
  }

  private int findLowestKey(Map<Integer, Integer> map) {
    int lowestCount = Integer.MAX_VALUE;
    int lowestKey = -1;

    for (Entry<Integer, Integer> entry : map.entrySet()) {
      int val = entry.getValue();
      if (val > 0 && val < lowestCount) {
        lowestCount = val;
        lowestKey = entry.getKey();
      }
    }

    return lowestKey;
  }
}
