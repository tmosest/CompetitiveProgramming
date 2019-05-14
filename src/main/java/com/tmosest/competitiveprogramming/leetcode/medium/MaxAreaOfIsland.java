package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Stack;

class MaxAreaOfIsland {
  /* Write code here. */

  /**
   * Return the max area of islands in the grid.
   *
   * @param grid The grid to check.
   * @return the max area.
   */
  public int maxAreaOfIsland(int[][] grid) {
    int maxIslandSize = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1) {
          int size = 0;
          Stack<Pair> pairs = new Stack<>();
          pairs.push(new Pair(i, j));
          while (!pairs.isEmpty()) {
            Pair pair = pairs.pop();
            if (grid[pair.row][pair.col] == 1) {
              grid[pair.row][pair.col] = -1;
              size++;
              maxIslandSize = Math.max(size, maxIslandSize);
              if (pair.row - 1 >= 0 && grid[pair.row - 1][pair.col] == 1) {
                pairs.push(new Pair(pair.row - 1, pair.col));
              }
              if (pair.row + 1 < grid.length && grid[pair.row + 1][pair.col] == 1) {
                pairs.push(new Pair(pair.row + 1, pair.col));
              }
              if (pair.col - 1 >= 0 && grid[pair.row][pair.col - 1] == 1) {
                pairs.push(new Pair(pair.row, pair.col - 1));
              }
              if (pair.col + 1 < grid[0].length && grid[pair.row][pair.col + 1] == 1) {
                pairs.push(new Pair(pair.row, pair.col + 1));
              }
            }
          }
        }
      }
    }
    return maxIslandSize;
  }

  private class Pair {

    int col;
    int row;

    private Pair(int row, int col) {
      this.row = row;
      this.col = col;
    }
  }


}
