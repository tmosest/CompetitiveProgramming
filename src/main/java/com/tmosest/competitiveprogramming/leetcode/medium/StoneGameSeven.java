package com.tmosest.competitiveprogramming.leetcode.medium;

class StoneGameSeven {

  int stoneGame7(int[] stones) {
    int len = stones.length;
    int[][] cache = new int[len][len];
    int[] sum = new int[len + 1];
    for (int i = 0; i < len; i++) {
      sum[i + 1] = sum[i] + stones[i];
    }
    for (int l = 2; l <= len; l++) {
      for (int start = 0; start + l - 1 < len; start++) {
        int end = start + l - 1;
        cache[start][end] = Math.max(sum[end + 1] - sum[start + 1] - cache[start + 1][end],
            sum[end] - sum[start] - cache[start][end - 1]);

      }
    }
    return cache[0][len - 1];
  }
}
