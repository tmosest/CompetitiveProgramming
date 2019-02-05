package com.tmosest.competitiveprogramming.leetcode;

public class MagicSquaresInGrid {

  /**
   * Count the number of magic squares inside the grid.
   * @param grid A matrix of integers.
   * @return The number of magic squares.
   */
  public int numMagicSquaresInside(int[][] grid) {
    int rows = grid.length;
    if (rows < 3) {
      return 0;
    }
    int cols = grid[0].length;
    if (cols < 3) {
      return 0;
    }
    int result = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (isMagicSquare(grid, i, j)) {
          ++result;
        }
      }
    }
    return result;
  }

  private boolean isMagicSquare(int[][] grid, int row, int col) {
    int rows = grid.length;
    int cols = grid[0].length;
    int[] counts = new int[9];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (row + i >= rows || col + j >= cols) {
          return false;
        }
        int digit = grid[row + i][col + j];
        if (digit <= 0 || digit > 9) {
          return false;
        }
        counts[digit - 1]++;
      }
    }
    for (int count : counts) {
      if (count < 1 || count > 1) {
        return false;
      }
    }

    return (
        grid[row][col] + grid[row][col + 1] + grid[row][col + 2] == 15
        && grid[row + 1][col] + grid[row + 1][col + 1] + grid[row + 1][col + 2] == 15
        && grid[row + 2][col] + grid[row + 2][col + 1] + grid[row + 2][col + 2] == 15
        && grid[row][col] + grid[row + 1][col] + grid[row + 2][col] == 15
        && grid[row][col + 1] + grid[row + 1][col + 1] + grid[row + 2][col + 1] == 15
        && grid[row][col + 2] + grid[row + 1][col + 2] + grid[row + 2][col + 2] == 15
        && grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2] == 15
        && grid[row + 2][col] + grid[row + 1][col + 1] + grid[row][col + 2] == 15
      );
  }
}
