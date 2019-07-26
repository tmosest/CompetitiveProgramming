package com.tmosest.competitiveprogramming.leetcode.medium;

class MaxIncreaseToKeepCitySkyline {

  int maxIncreaseKeepingSkyline(int[][] grid) {
    int len = grid.length;
    int[] top = new int[len];
    int[] left = new int[len];

    for (int i = 0; i < len; i++) {
      int max = Integer.MIN_VALUE;
      for (int j = 0; j < len; j++) {
        max = Math.max(max, grid[i][j]);
      }
      left[i] = max;
    }

    for (int i = 0; i < len; i++) {
      int max = Integer.MIN_VALUE;
      for (int j = 0; j < len; j++) {
        max = Math.max(max, grid[j][i]);
      }
      top[i] = max;
    }
    int total = 0;
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {
        int temp = Math.min(left[i], top[j]);
        total += temp - grid[i][j];
        grid[i][j] = Math.min(left[i], top[j]);
      }
    }
    return total;
  }
}
