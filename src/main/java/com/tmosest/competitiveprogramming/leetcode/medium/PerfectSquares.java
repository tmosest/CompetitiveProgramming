package com.tmosest.competitiveprogramming.leetcode.medium;

class PerfectSquares {

  int numSquares(int num) {
    int[] dp = new int[num + 1];  // use this array as the map index lookup
    dp[1] = 1;
    for (int i = 2; i <= num; i++) {
      int min = i;
      for (int j = 1; j < i; j++) {
        int next = j * j;
        int remain = i - next;
        if (remain < 0) {
          break;
        } else if (remain == 0) {
          dp[i] = 1;
          break;
        } else {
          int val = dp[remain] + 1;
          if (val < min) {
            min = val;
          }
        }
      }
      if (dp[i] == 0) {
        dp[i] = min;
      }
    }
    return dp[num];
  }
}
