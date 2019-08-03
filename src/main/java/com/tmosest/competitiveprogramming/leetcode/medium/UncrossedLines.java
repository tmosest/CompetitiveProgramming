package com.tmosest.competitiveprogramming.leetcode.medium;

class UncrossedLines {

  public int maxUncrossedLines(int[] one, int[] two) {
    int[][] dp = new int[one.length][two.length];
    for (int i = 0; i < one.length; i++) {
      for (int j = 0; j < two.length; j++) {
        if (one[i] == two[j]) {
          if (i == 0 || j == 0) {
            dp[i][j] = 1;
          } else {
            dp[i][j] = dp[i - 1][j - 1] + 1;
          }
        } else {
          if (i == 0 && j == 0) {
            dp[i][j] = 0;
          } else if (i == 0) {
            dp[i][j] = dp[i][j - 1];
          } else if (j == 0) {
            dp[i][j] = dp[i - 1][j];
          } else {
            dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
          }
        }

      }
    }
    return dp[one.length - 1][two.length - 1];
  }
}
