package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class FlipColumnsForMaximumNumberOfEqualRows {

  private int max = 0;

  public int maxEqualRowsAfterFlips(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < rows; i++) {
      String one = "";
      String two = "";
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] == 0) {
          one += j;
        } else {
          two += j;
        }
      }
      map.put(one, map.getOrDefault(one, 0) + 1);
      map.put(two, map.getOrDefault(two, 0) + 1);
      max = Math.max(Math.max(map.get(one), map.get(two)), max);
    }
    return max;
  }
}
