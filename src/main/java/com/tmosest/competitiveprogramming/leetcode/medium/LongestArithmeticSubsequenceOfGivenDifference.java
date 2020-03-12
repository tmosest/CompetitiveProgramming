package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class LongestArithmeticSubsequenceOfGivenDifference {

  int longestSubsequence(int[] arr, int difference) {
    if (arr == null || arr.length == 0) {
      return 0;
    }
    Map<Integer, Integer> map = new HashMap<>();
    map.put(arr[0], 1);
    int maxLen = 1;
    for (int i = 1; i < arr.length; i++) {
      if (map.containsKey(arr[i] - difference)) {
        map.put(arr[i], map.get(arr[i] - difference) + 1);
        maxLen = Math.max(maxLen, map.get(arr[i]));
      } else {
        map.put(arr[i], 1);
      }
    }
    return maxLen;
  }
}
