package com.tmosest.competitiveprogramming.leetcode.easy;

class CountNegativeNumbersInSortedMatrix {

  int countNegatives(int[][] grid) {
    int count = 0;

    for (int r = 0; r < grid.length; r++) {
      for (int c = grid[r].length - 1; c >= 0; c--) {
        if (grid[r][c] >= 0) {
          break;
        }
        ++count;
      }
    }

    return count;
  }
}
