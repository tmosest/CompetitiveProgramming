package com.tmosest.competitiveprogramming.leetcode.easy;

class SurfaceAreaOfShapes {
  /* Write code here. */

  /**
   * Determine surface area of 3D shapes.
   *
   * @param grid A grid of heights.
   * @return The surface area.
   */
  public int surfaceArea(int[][] grid) {
    int result = 0;
    for (int r = 0; r < grid.length; r++) {
      for (int c = 0; c < grid[0].length; c++) {
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        if (r - 1 >= 0) {
          up = grid[r - 1][c];
        }
        if (r + 1 < grid.length) {
          down = grid[r + 1][c];
        }
        if (c - 1 >= 0) {
          left = grid[r][c - 1];
        }
        if (c + 1 < grid[0].length) {
          right = grid[r][c + 1];
        }
        int height = grid[r][c];
        for (int i = 1; i <= height; i++) {
          int surface = 6;
          if (i > 1) {
            surface -= 1;
          }
          if (i != height) {
            surface -= 1;
          }
          if (i <= up) {
            surface -= 1;
          }
          if (i <= down) {
            surface -= 1;
          }
          if (i <= right) {
            surface -= 1;
          }
          if (i <= left) {
            surface -= 1;
          }
          result += surface;
        }
      }
    }
    return result;
  }


}
