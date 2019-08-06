package com.tmosest.competitiveprogramming.leetcode.medium;

class MaxIncreaseToKeepCitySkyline {

  int maxIncreaseKeepingSkyline(int[][] grid) {
    int len = grid.length;
    int[] rowMaxes = new int[len];
    int[] colMaxes = new int[len];

    for (int r = 0; r < len; ++r) {
      for (int c = 0; c < len; ++c) {
        rowMaxes[r] = Math.max(rowMaxes[r], grid[r][c]);
        colMaxes[c] = Math.max(colMaxes[c], grid[r][c]);
      }
    }

    int ans = 0;
    for (int r = 0; r < len; ++r) {
      for (int c = 0; c < len; ++c) {
        ans += Math.min(rowMaxes[r], colMaxes[c]) - grid[r][c];
      }
    }

    return ans;
  }
}
