package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashMap;

class RepeatedElement {
  /* Write code here. */

  /**
   * Determine element that is repeated N times.
   *
   * @param input The input array.
   * @return The element that is repeated.
   */
  public int repeatedNTimes(int[] input) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : input) {
      Integer count = map.get(num);
      count = (count == null) ? 1 : count + 1;
      map.put(num, count);
    }
    int size = input.length / 2;
    for (Integer key : map.keySet()) {
      Integer count = map.get(key);
      if (count == size) {
        return key;
      }
    }
    return -1;
  }


}
