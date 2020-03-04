package com.tmosest.competitiveprogramming.leetcode.medium;

class Search2dMatrix {

  boolean searchMatrix(int[][] matrix, int target) {

    if (matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }

    int row = 0;
    int col = matrix[row].length - 1;

    while (row < matrix.length && target > matrix[row][col]) {
      ++row;
    }

    if (row == matrix.length) {
      return false;
    }

    for (; col >= 0; col--) {
      if (matrix[row][col] == target) {
        return true;
      }
    }

    return false;
  }
}
