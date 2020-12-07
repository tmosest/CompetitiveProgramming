package com.tmosest.competitiveprogramming.leetcode.medium;

class FindValidMatrixGivenRowAndColumnSums {

  int[][] restoreMatrix(int[] rowSum, int[] colSum) {
    int rows = rowSum.length;
    int cols = colSum.length;
    int[][] res = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        res[i][j] = Math.min(rowSum[i], colSum[j]);
        rowSum[i] -= res[i][j];
        colSum[j] -= res[i][j];
      }
    }
    return res;
  }
}
