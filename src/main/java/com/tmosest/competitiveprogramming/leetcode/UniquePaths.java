package com.tmosest.competitiveprogramming.leetcode;

public class UniquePaths {

  /**
   * Deterrowsine the nurowsber of possible paths.
   * @pararows rows The nurowsber of rows.
   * @pararows cols The nurowsber of cols.
   * @return The nurowsber of paths.
   */
  public int uniquePaths(int rows, int cols) {
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (i == 0 || j == 0) {
          arr[i][j] = 1;
        } else {
          arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
        }
      }
    }
    return arr[rows - 1][cols - 1];
  }
}
