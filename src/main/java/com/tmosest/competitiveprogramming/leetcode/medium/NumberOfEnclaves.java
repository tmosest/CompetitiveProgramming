package com.tmosest.competitiveprogramming.leetcode.medium;

class NumberOfEnclaves {
  /* Write code here. */

  /**
   * Determines how many starting points don't lead to an edge.
   *
   * @param grid The grid of zeros and ones.
   * @return The number of 1's that don't connect to an edge.
   */
  public int numEnclaves(int[][] grid) {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (i == 0 || i == grid.length - 1 || j == 0 || j == grid[0].length - 1) {
          dfs(grid, i, j);
        }
      }
    }
    int result = 0;
    for (int[] row : grid) {
      for (int cell : row) {
        if (cell == 1) {
          ++result;
        }
      }
    }
    return result;
  }

  private void dfs(int[][] grid, int row, int col) {
    if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) {
      return;
    }
    grid[row][col] = 0;
    dfs(grid, row - 1, col);
    dfs(grid, row + 1, col);
    dfs(grid, row, col - 1);
    dfs(grid, row, col + 1);
  }


}
