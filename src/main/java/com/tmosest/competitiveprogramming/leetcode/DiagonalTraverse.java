package com.tmosest.competitiveprogramming.leetcode;

public class DiagonalTraverse {

  /**
   * Traverse through the matrix as a snake would.
   * @param matrix The matrix to go through.
   * @return An array of the values we saw along the path.
   */
  public int[] findDiagonalOrder(int[][] matrix) {
    int rows = matrix.length;
    if (rows == 0) {
      return new int[0];
    }
    int cols = matrix[0].length;
    int[] result = new int[rows * cols];
    int index = 0;
    int sum = 0;
    while (sum <= rows + cols - 2) {
      int[] pos = {sum, 0};
      int[] direction = {-1, 1};
      if (sum % 2 == 1) {
        pos[0] = 0;
        pos[1] = sum;
        direction[0] = 1;
        direction[1] = -1;
      }
      while (Math.abs(pos[0] - pos[1]) <= sum) {
        if (pos[0] >= 0 && pos[0] < rows && pos[1] >= 0 && pos[1] < cols) {
          result[index++] = matrix[pos[0]][pos[1]];
        }
        pos[0] += direction[0];
        pos[1] += direction[1];
      }
      sum++;
    }
    return result;
  }
}
