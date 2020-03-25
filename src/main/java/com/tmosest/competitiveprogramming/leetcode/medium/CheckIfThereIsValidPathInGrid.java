package com.tmosest.competitiveprogramming.leetcode.medium;

class CheckIfThereIsValidPathInGrid {

  private boolean res;
  private boolean[][] visited;

  boolean hasValidPath(int[][] grid) {
    res = false;
    visited = new boolean[grid.length][grid[0].length];
    traverseGraph(grid, 0, 0, 0, 0);
    return res;
  }

  private void traverseGraph(int[][] grid, int row, int col, int prevRow, int prevCol) {
    if (row >= grid.length || col >= grid[0].length || row < 0 || col < 0) {
      return;
    }
    if (visited[row][col]) {
      return;
    }
    int prevVal = grid[prevRow][prevCol];
    visited[prevRow][prevCol] = true;
    boolean valid = false;
    boolean start = prevRow == row && prevCol == col;
    switch (grid[row][col]) {
      case 1:
        if (prevCol < col || start) {
          if (prevVal != 4 && prevVal != 1 && prevVal != 6 && !start) {
            return;
          }
          traverseGraph(grid, row, col + 1, row, col);
          valid = true;
        }
        if (prevCol > col || start) {
          if (prevVal != 3 && prevVal != 1 && prevVal != 5 && !start) {
            return;
          }
          traverseGraph(grid, row, col - 1, row, col);
          valid = true;
        }
        break;
      case 2:
        if (prevRow < row || start) {
          if (prevVal != 2 && prevVal != 4 && prevVal != 3 && !start) {
            return;
          }
          traverseGraph(grid, row + 1, col, row, col);
          valid = true;
        }
        if (prevRow > row || start) {
          if (prevVal != 2 && prevVal != 5 && prevVal != 6 && !start) {
            return;
          }
          traverseGraph(grid, row - 1, col, row, col);
          valid = true;
        }
        break;
      case 3:
        if (prevCol < col || start) {
          if (prevVal != 1 && prevVal != 4 && prevVal != 6 && !start) {
            return;
          }
          traverseGraph(grid, row + 1, col, row, col);
          valid = true;
        }
        if (prevRow > row || start) {
          if (prevVal != 2 && prevVal != 5 && prevVal != 6 && !start) {
            return;
          }
          traverseGraph(grid, row, col - 1, row, col);
          valid = true;
        }
        break;
      case 4:
        if (prevCol > col || start) {
          if (prevVal != 1 && prevVal != 3 && prevVal != 6 && !start) {
            return;
          }
          traverseGraph(grid, row + 1, col, row, col);
          valid = true;
        }
        if (prevRow > row || start) {
          if (prevVal != 2 && prevVal != 5 && prevVal != 6 && !start) {
            return;
          }
          traverseGraph(grid, row, col + 1, row, col);
          valid = true;
        }
        break;
      case 5:
        if (prevCol < col || start) {
          if (prevVal != 1 && prevVal != 4 && prevVal != 6 && !start) {
            return;
          }
          traverseGraph(grid, row - 1, col, row, col);
          valid = true;
        }
        if (prevRow < row || start) {
          if (prevVal != 2 && prevVal != 3 && prevVal != 4 && !start) {
            return;
          }
          traverseGraph(grid, row, col - 1, row, col);
          valid = true;
        }
        break;
      default:
        if (prevCol > col || start) {
          if (prevVal != 1 && prevVal != 3 && prevVal != 5 && !start) {
            return;
          }
          traverseGraph(grid, row - 1, col, row, col);
          valid = true;
        }
        if (prevRow < row || start) {
          if (prevVal != 2 && prevVal != 3 && prevVal != 4 && !start) {
            return;
          }
          traverseGraph(grid, row, col + 1, row, col);
          valid = true;
        }
        break;
    }
    if (valid && row == grid.length - 1 && col == grid[0].length - 1) {
      res = true;
    }
  }
}
