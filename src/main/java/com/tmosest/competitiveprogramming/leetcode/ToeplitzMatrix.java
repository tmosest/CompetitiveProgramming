package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ToeplitzMatrix {

  /**
   * Determine if every diagonal from top-left to bottom-right has the same element.
   * @param matrix The matrix to check.
   * @return True if it is a Toeplitz Matrix.
   */
  public boolean isToeplitzMatrix(int[][] matrix) {
    Map<Integer, Integer> groups = new HashMap<>();
    for (int r = 0; r < matrix.length; ++r) {
      for (int c = 0; c < matrix[0].length; ++c) {
        if (!groups.containsKey(r - c)) {
          groups.put(r - c, matrix[r][c]);
        } else if (groups.get(r - c) != matrix[r][c]) {
          return false;
        }
      }
    }
    return true;
  }
}
