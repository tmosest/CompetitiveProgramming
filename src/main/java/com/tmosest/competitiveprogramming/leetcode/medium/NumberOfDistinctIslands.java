package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

class NumberOfDistinctIslands {

  private int[][] grid;

  private class Island {

    private int left = Integer.MAX_VALUE;
    private int right = Integer.MIN_VALUE;
    private int top = Integer.MAX_VALUE;
    private int bottom = Integer.MIN_VALUE;

    private void updateBounds(int row, int col) {
      left = Math.min(col, left);
      right = Math.max(col, right);
      bottom = Math.max(row, bottom);
      top = Math.min(row, top);
    }

    @Override
    public boolean equals(Object other) {
      if (this == other) {
        return true;
      }
      if (other == null || getClass() != other.getClass()) {
        return false;
      }
      Island island = (Island) other;
      if (this.right - this.left != island.right - island.left) {
        return false;
      }
      if (this.bottom - this.top != island.bottom - island.top) {
        return false;
      }
      for (int i = 0; i <= this.bottom - this.top; i++) {
        for (int j = 0; j <= this.right - this.left; j++) {
          if (grid[this.top + i][this.left + j] != grid[island.top + i][island.left + j]) {
            return false;
          }
        }
      }
      return true;
    }

    @Override
    public int hashCode() {
      return (43 + 777);
    }

    private void print() {
      System.out.println("Island:");
      System.out.println("left: " + left);
      System.out.println("right: " + right);
      System.out.println("top: " + top);
      System.out.println("bottom: " + bottom);
      System.out.println("grid:");
      for (int i = top; i <= bottom; i++) {
        for (int j = left; j <= right; j++) {
          System.out.print(grid[i][j] + " ");
        }
        System.out.println();
      }
      System.out.println("\n");
    }
  }

  /**
   * Determine the number of distinct island configurations.
   *
   * @param grid The grid of water and land.
   * @return The number of distinct islands.
   */
  public int numDistinctIslands(int[][] grid) {
    this.grid = grid;
    Set<Island> islands = new HashSet<>();
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1) {
          Island island = new Island();
          depthFirstSearch(i, j, island);
          // island.print();
          islands.add(island);
        }
      }
    }
    return islands.size();
  }

  private void depthFirstSearch(int row, int col, Island island) {
    if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] != 1) {
      return;
    }
    island.updateBounds(row, col);
    grid[row][col] = -1;
    depthFirstSearch(row - 1, col, island);
    depthFirstSearch(row + 1, col, island);
    depthFirstSearch(row, col - 1, island);
    depthFirstSearch(row, col + 1, island);
  }
}
