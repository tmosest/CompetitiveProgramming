package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class PairsOfSongsWithTotalDurationsDivisibleBySixty {
  /* Write code here. */

  /**
   * Determine the number of pairs whose sum is divisible by 60.
   *
   * @param times An array of times.
   * @return The number of paris divisible by sixty.
   */
  public int numPairsDivisibleBy60(int[] times) {
    int result = 0;
    if (times.length < 2) {
      return result;
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < times.length; i++) {
      times[i] = times[i] % 60;
      if (map.containsKey(60 - times[i])) {
        result += map.get(60 - times[i]);
      }
      Integer count = map.get(times[i]);
      count = (count == null) ? 1 : count + 1;
      map.put(times[i], count);
    }
    if (map.containsKey(0)) {
      int count = map.get(0);
      result += (count - 1) * count / 2;
    }
    return result;
  }


}
