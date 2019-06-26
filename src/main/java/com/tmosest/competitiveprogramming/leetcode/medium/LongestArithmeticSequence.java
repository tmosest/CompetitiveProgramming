package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class LongestArithmeticSequence {

  /**
   * Determine the longest arithmetic sequence within an array.
   *
   * @param arr The array of values.
   * @return The length of the longest arithmetic sequence.
   */
  public int longestArithSeqLength(int[] arr) {
    int res = 0;
    Map<Integer, Integer>[] dp = new HashMap[arr.length];
    dp[0] = new HashMap<>();
    for (int i = 1; i < arr.length; i++) {
      dp[i] = new HashMap<>();
      for (int j = 0; j < i; j++) {
        int diff = arr[i] - arr[j];
        if (dp[j].containsKey(diff)) {
          dp[i].put(diff, dp[j].get(diff) + 1);
        } else {
          dp[i].put(diff, 2);
        }
        res = Math.max(res, dp[i].get(diff));
      }
    }
    return res;
  }
}
