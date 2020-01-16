package com.tmosest.competitiveprogramming.leetcode.easy;

class CheckIfItIsStraightLine {

  boolean checkStraightLine(int[][] coordinates) {
    if (coordinates.length <= 2) {
      return true;
    }
    int y0 = coordinates[1][1] - coordinates[0][1];
    int x0 = coordinates[1][0] - coordinates[0][0];
    for (int i = 2; i < coordinates.length; i++) {
      int y1 = coordinates[i][1] - coordinates[i - 1][1];
      int x1 = coordinates[i][0] - coordinates[i - 1][0];
      if (y0 * x1 != y1 * x0) {
        return false;
      }
    }
    return true;
  }
}
