package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class OutOfBoundaryPaths {

  private int mode = 1000000007;

  int findPaths(int rows, int cols, int size, int row, int col) {
    int[][][] memo = new int[rows][cols][size + 1];
    for (int[][] l : memo) {
      for (int[] sl : l) {
        Arrays.fill(sl, -1);
      }
    }
    return findPaths(rows, cols, size, row, col, memo);
  }

  private int findPaths(int row, int col, int size, int rows, int cols, int[][][] memo) {
    if (rows == row || cols == col || rows < 0 || cols < 0) {
      return 1;
    }
    if (size == 0) {
      return 0;
    }
    if (memo[rows][cols][size] >= 0) {
      return memo[rows][cols][size];
    }
    memo[rows][cols][size] =
        ((findPaths(row, col, size - 1, rows - 1, cols, memo) + findPaths(row, col, size - 1,
            rows + 1, cols, memo)) % mode
            + (findPaths(row, col, size - 1, rows, cols - 1, memo) + findPaths(row, col, size - 1,
            rows, cols + 1, memo)) % mode)
            % mode;
    return memo[rows][cols][size];
  }
}
