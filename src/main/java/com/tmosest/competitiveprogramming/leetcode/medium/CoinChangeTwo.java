package com.tmosest.competitiveprogramming.leetcode.medium;

class CoinChangeTwo {

  int change(int amount, int[] coins) {

    int[] dp = new int[amount + 1];
    dp[0] = 1;

    for (int i : coins) {
      for (int j = 1; j < amount + 1; j++) {
        if (i <= j) {
          dp[j] += dp[j - i];
        }
      }
    }

    return dp[amount];
  }
}
