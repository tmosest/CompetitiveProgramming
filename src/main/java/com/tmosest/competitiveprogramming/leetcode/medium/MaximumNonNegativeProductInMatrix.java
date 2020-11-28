package com.tmosest.competitiveprogramming.leetcode.medium;

class MaximumNonNegativeProductInMatrix {

  int maxProductPath(int[][] grid) {
    int rows = grid.length;
    int cols = grid[0].length;
    long[][][] dp = new long[rows][cols][2];
    long res = -1;
    long mod = 1000000007;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (i == 0 && j == 0) {
          dp[i][j][0] = grid[i][j];
          dp[i][j][1] = grid[i][j];
          if (i == rows - 1 && j == cols - 1) {
            res = Math.max(res, dp[i][j][1]);
          }
          continue;
        }
        dp[i][j][0] = Integer.MAX_VALUE;
        dp[i][j][1] = Integer.MIN_VALUE;
        if (grid[i][j] > 0) {
          if (i > 0) {
            dp[i][j][0] = Math.min(dp[i][j][0], dp[i - 1][j][0] * grid[i][j]);
            dp[i][j][1] = Math.max(dp[i][j][1], dp[i - 1][j][1] * grid[i][j]);
          }
          if (j > 0) {
            dp[i][j][0] = Math.min(dp[i][j][0], dp[i][j - 1][0] * grid[i][j]);
            dp[i][j][1] = Math.max(dp[i][j][1], dp[i][j - 1][1] * grid[i][j]);
          }
        } else {
          if (i > 0) {
            dp[i][j][0] = Math.min(dp[i][j][0], dp[i - 1][j][1] * grid[i][j]);
            dp[i][j][1] = Math.max(dp[i][j][1], dp[i - 1][j][0] * grid[i][j]);
          }
          if (j > 0) {
            dp[i][j][0] = Math.min(dp[i][j][0], dp[i][j - 1][1] * grid[i][j]);
            dp[i][j][1] = Math.max(dp[i][j][1], dp[i][j - 1][0] * grid[i][j]);
          }
        }
        if (i == rows - 1 && j == cols - 1) {
          res = Math.max(res, dp[i][j][1]);
        }
      }
    }
    return (int) (res % mod);
  }
}
