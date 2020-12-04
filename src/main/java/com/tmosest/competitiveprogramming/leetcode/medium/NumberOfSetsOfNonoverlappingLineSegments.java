package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class NumberOfSetsOfNonoverlappingLineSegments {

  int numberOfSets(int num, int target) {
    int[] dp = new int[num];
    Arrays.fill(dp, 1);
    int mod = 1_000_000_007;
    for (int i = 1; i <= target; i++) {
      int sum = dp[0];
      dp[0] = 0;
      for (int j = 1; j < num; j++) {
        int prev = dp[j];
        dp[j] = (sum + dp[j - 1]) % mod;
        sum = (sum + prev) % mod;
      }
    }
    return dp[num - 1];
  }
}
