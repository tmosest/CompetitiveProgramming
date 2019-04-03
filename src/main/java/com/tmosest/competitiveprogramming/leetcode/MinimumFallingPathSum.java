package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;

public class MinimumFallingPathSum {

  private int[][] mins;

  /**
   * Determines minimum cost of falling. Where you can fall +- 1 column.
   * @param grid The grid of values.
   * @return The minimum sum falling.
   */
  public int minFallingPathSum(int[][] grid) {
    mins = new int[grid.length][grid[0].length];
    // Fill min gird
    for (int[] row : mins) {
      Arrays.fill(row, Integer.MAX_VALUE);
    }
    // Reset the first row of min to be the value in grid.
    for (int col = 0; col < grid[0].length; col++) {
      mins[0][col] = grid[0][col];
    }
    for (int row = 1; row < grid.length; row++) {
      for (int col = 0; col < grid[0].length; col++) {
        int val = mins[row - 1][col];
        if (col > 0) {
          val = Math.min(val, mins[row - 1][col - 1]);
        }
        if (col < grid[0].length - 1) {
          val = Math.min(val, mins[row - 1][col + 1]);
        }
        mins[row][col] = Math.min(mins[row][col], grid[row][col] + val);
      }
    }
    int result = Integer.MAX_VALUE;
    for (int col = 0; col < grid[0].length; col++) {
      result = Math.min(mins[grid.length - 1][col], result);
    }
    return result;
  }
}
