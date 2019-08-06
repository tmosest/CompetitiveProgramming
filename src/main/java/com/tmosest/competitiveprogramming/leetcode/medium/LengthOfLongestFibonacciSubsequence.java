package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class LengthOfLongestFibonacciSubsequence {

  int lenLongestFibSubseq(int[] arr) {
    int len = arr.length;
    Map<Integer, Integer> index = new HashMap<>();
    for (int i = 0; i < len; ++i) {
      index.put(arr[i], i);
    }

    Map<Integer, Integer> longest = new HashMap<>();
    int ans = 0;

    for (int k = 0; k < len; ++k) {
      for (int j = 0; j < k; ++j) {
        int temp = index.getOrDefault(arr[k] - arr[j], -1);
        if (temp >= 0 && temp < j) {
          // Encoding tuple (i, j) as integer (i * N + j)
          int cand = longest.getOrDefault(temp * len + j, 2) + 1;
          longest.put(j * len + k, cand);
          ans = Math.max(ans, cand);
        }
      }
    }

    return ans >= 3 ? ans : 0;
  }


}
