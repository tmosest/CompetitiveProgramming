package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class LuckyNumbersInMatrix {

  List<Integer> luckyNumbers(int[][] matrix) {
    List<Integer> results = new ArrayList<>();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        int rowMin = matrix[i][j];
        int colMax = matrix[i][j];

        for (int k = 0; k < matrix.length; k++) {
          colMax = Math.max(colMax, matrix[k][j]);
        }

        for (int k = 0; k < matrix[0].length; k++) {
          rowMin = Math.min(rowMin, matrix[i][k]);
        }

        if (rowMin == colMax && rowMin == matrix[i][j]) {
          results.add(rowMin);
        }
      }
    }
    return results;
  }
}
