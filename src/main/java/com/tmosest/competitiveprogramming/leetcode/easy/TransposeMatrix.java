package com.tmosest.competitiveprogramming.leetcode.easy;

class TransposeMatrix {
  /* Write code here. */

  /**
   * Transpose a matrix.
   *
   * @param matrix Matrix to transpose.
   * @return The transposed matrix.
   */
  public int[][] transpose(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] ans = new int[cols][rows];
    for (int r = 0; r < rows; ++r) {
      for (int c = 0; c < cols; ++c) {
        ans[c][r] = matrix[r][c];
      }
    }
    return ans;
  }


}
