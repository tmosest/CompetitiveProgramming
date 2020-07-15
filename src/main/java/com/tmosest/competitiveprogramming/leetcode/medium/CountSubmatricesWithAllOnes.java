package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class CountSubmatricesWithAllOnes {

  int numSubmat(int[][] mat) {

    int rows = mat.length;
    int cols = mat[0].length;

    int res = 0;
    for (int up = 0; up < rows; ++up) {
      int[] tmp = new int[cols];
      Arrays.fill(tmp, 1);
      for (int down = up; down < rows; ++down) {
        for (int k = 0; k < cols; ++k) {
          tmp[k] &= mat[down][k];
        }
        res += countOneRow(tmp);
      }
    }

    return res;
  }

  private int countOneRow(int[] mat) {

    int res = 0;
    int length = 0;
    for (int i = 0; i < mat.length; ++i) {
      length = (mat[i] == 0 ? 0 : length + 1);
      res += length;
    }
    return res;
  }
}
