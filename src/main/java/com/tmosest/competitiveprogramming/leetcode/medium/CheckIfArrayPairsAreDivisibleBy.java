package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class CheckIfArrayPairsAreDivisibleBy {

  boolean canArrange(int[] arr, int diff) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      int rem = arr[i] % diff;
      if (rem < 0) {
        rem += diff;
      }
      if (map.containsKey(rem)) {
        map.put(rem, map.get(rem) - 1);
        if (map.get(rem) == 0) {
          map.remove(rem);
        }
      } else {
        if (rem == 0) {
          map.put(0, map.getOrDefault(0, 0) + 1);
          continue;
        }
        map.put(diff - rem, map.getOrDefault(diff - rem, 0) + 1);
      }
    }
    return map.isEmpty();
  }
}
