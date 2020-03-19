package com.tmosest.competitiveprogramming.leetcode.medium;

class PathWithMaximumGold {

  private int rows;
  private int cols;
  private int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

  int getMaximumGold(int[][] arr) {
    rows = arr.length;
    cols = arr[0].length;
    int res = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        res = Math.max(res, dfs(arr, i, j));
      }
    }
    return res;
  }

  private int dfs(int[][] arr, int row, int col) {
    if (row < 0 || row >= rows || col < 0 || col >= cols || arr[row][col] <= 0) {
      return 0;
    }
    int max = 0;
    arr[row][col] *= -1;

    for (int[] d : dirs) {
      max = Math.max(max, dfs(arr, row + d[0], col + d[1]));
    }

    arr[row][col] *= -1;
    return arr[row][col] + max;
  }
}
