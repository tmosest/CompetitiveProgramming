package com.tmosest.competitiveprogramming.leetcode.easy;

class ImageOverlap {

  /**
   * Determine largest overlap.
   *
   * @param one First matrix.
   * @param two Second matrix.
   * @return The overlap.
   */
  int largestOverlap(int[][] one, int[][] two) {
    int len = one.length;
    int[][] count = new int[2 * len + 1][2 * len + 1];
    for (int i = 0; i < len; ++i) {
      for (int j = 0; j < len; ++j) {
        if (one[i][j] == 1) {
          for (int i2 = 0; i2 < len; ++i2) {
            for (int j2 = 0; j2 < len; ++j2) {
              if (two[i2][j2] == 1) {
                count[i - i2 + len][j - j2 + len] += 1;
              }
            }
          }
        }
      }
    }

    int ans = 0;
    for (int[] row : count) {
      for (int v : row) {
        ans = Math.max(ans, v);
      }
    }
    return ans;
  }

}
