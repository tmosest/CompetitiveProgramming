package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class ElementAppearingMoreThanTwentyFivePercentInSortedArray {

  public int findSpecialInteger(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int val : arr) {
      int count = map.getOrDefault(val, 0);
      map.put(val, count + 1);
    }

    int threshold = (int) (arr.length * 0.25);

    for (int key : map.keySet()) {
      int val = map.getOrDefault(key, 0);
      if (val > threshold) {
        return key;
      }
    }

    return -1;
  }
}
