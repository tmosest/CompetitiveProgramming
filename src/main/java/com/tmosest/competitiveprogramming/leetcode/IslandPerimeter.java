package com.tmosest.competitiveprogramming.leetcode;

public class IslandPerimeter {

  private boolean shouldCountPerimeter(int[][] grid, int row, int col) {
    return row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0;
  }

  /**
   * Finds the perimeter of the one island in the grid.
   * @param grid An array of arrays that represents the island.
   * @return The perimeter of the island.
   */
  public int islandPerimeter(int[][] grid) {
    int perimeter = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1) {
          if (shouldCountPerimeter(grid, i - 1, j)) {
            ++perimeter;
          }
          if (shouldCountPerimeter(grid, i + 1, j)) {
            ++perimeter;
          }
          if (shouldCountPerimeter(grid, i, j - 1)) {
            ++perimeter;
          }
          if (shouldCountPerimeter(grid, i, j + 1)) {
            ++perimeter;
          }
        }
      }
    }
    return perimeter;
  }
}
