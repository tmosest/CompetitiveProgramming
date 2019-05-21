package com.tmosest.competitiveprogramming.leetcode.medium;

class UniquePaths {
  /* Write code here. */

  /**
   * Deterrowsine the nurowsber of possible paths.
   *
   * @return The nurowsber of paths.
   * @pararows rows The nurowsber of rows.
   * @pararows cols The nurowsber of cols.
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
