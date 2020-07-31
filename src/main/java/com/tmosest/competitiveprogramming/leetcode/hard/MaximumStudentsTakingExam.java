package com.tmosest.competitiveprogramming.leetcode.hard;

class MaximumStudentsTakingExam {

  int maxStudents(char[][] seats) {
    int rows = seats.length;
    int cols = seats[0].length;
    // dp means ith row's original state, available spot
    // filled with '1' otherwise '0', may not be a valid state
    int[] dp = new int[rows + 1];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < cols; j++) {
        dp[i] = (dp[i] << 1) + (seats[i - 1][j] == '.' ? 1 : 0);
      }
    }
    int res = 0;
    int state = 1 << cols;
    int[][] maxs = new int[rows + 1][state];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < state; j++) {
        if ((dp[i] & j) == j && (j & (j >> 1)) == 0) {
          for (int m = 0; m < state; m++) {
            if ((m & dp[i - 1]) == m && ((m >> 1) & j) == 0 && ((j >> 1) & m) == 0) {
              maxs[i][j] = Math.max(maxs[i][j], maxs[i - 1][m] + Integer.bitCount(j));
            }
          }
          res = Math.max(res, maxs[i][j]);
        }
      }
    }
    return res;
  }
}
