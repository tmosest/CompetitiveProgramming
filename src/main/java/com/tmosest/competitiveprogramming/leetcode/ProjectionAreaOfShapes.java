package com.tmosest.competitiveprogramming.leetcode;

public class ProjectionAreaOfShapes {

  /**
   * Projection surface area from top, front, and side.
   * @param grid The height of the cubes.
   * @return The projected surface area.
   */
  public int projectionArea(int[][] grid) {
    int result = 0;
    // Back and Top
    int[] backs = new int[grid[0].length];
    int[] lefts = new int[grid.length];
    for (int r = 0; r < grid.length; r++) {
      for (int c = 0; c < grid[0].length; c++) {
        backs[c] = Math.max(grid[r][c], backs[c]);
        lefts[r] = Math.max(grid[r][c], lefts[r]);
        if (grid[r][c] > 0) {
          result++;
        }
      }
    }
    for (int back : backs) {
      result += back;
    }
    for (int left : lefts) {
      result += left;
    }
    return result;
  }
}
