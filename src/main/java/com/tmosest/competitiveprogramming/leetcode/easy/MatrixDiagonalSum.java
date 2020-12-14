package com.tmosest.competitiveprogramming.leetcode.easy;

class MatrixDiagonalSum {

  int diagonalSum(int[][] mat) {
    int res = 0;
    int size = mat.length;

    for (int i = 0; i < size; i++) {
      res += mat[i][i];

      if (size - i - 1 == i) {
        continue;
      }

      res += mat[size - i - 1][i];
    }

    return res;
  }
}
