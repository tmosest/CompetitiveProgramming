package com.tmosest.competitiveprogramming.leetcode.medium;

class IntegerBreak {

  /**
   * Break a number up into sums such that they form the largest possible product.
   *
   * @param num The number to break up.
   * @return The max product.
   */
  int integerBreak(int num) {
    if (num == 1) {
      return 0;
    }
    if (num == 2) {
      return 1;
    }
    if (num == 3) {
      return 2;
    }
    int[] dp = new int[num + 1];
    dp[2] = 2;
    dp[3] = 3;
    for (int i = 4; i < num + 1; i++) {
      dp[i] = (i % 3 == 0) ? 3 * dp[i - 3] : 2 * dp[i - 2];
    }
    return dp[num];
  }
}
