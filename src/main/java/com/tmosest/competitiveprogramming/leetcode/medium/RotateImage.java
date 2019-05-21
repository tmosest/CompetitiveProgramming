package com.tmosest.competitiveprogramming.leetcode.medium;

class RotateImage {
  /* Write code here. */

  /**
   * Rotate a matrix in place.
   *
   * @param matrix The matrix to rotate.
   */
  public void rotate(int[][] matrix) {
    int length = matrix.length;
    // transpose matrix
    for (int i = 0; i < length; i++) {
      for (int j = i; j < length; j++) {
        int tmp = matrix[j][i];
        matrix[j][i] = matrix[i][j];
        matrix[i][j] = tmp;
      }
    }
    // reverse each row
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length / 2; j++) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[i][length - j - 1];
        matrix[i][length - j - 1] = tmp;
      }
    }
  }


}
