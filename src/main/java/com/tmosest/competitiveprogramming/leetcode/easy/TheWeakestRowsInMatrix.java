package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;

class TheWeakestRowsInMatrix {

  class SortByStrength implements Comparator<int[]> {

    public int compare(int[] one, int[] two) {
      return one[1] - two[1];
    }
  }

  private int findStrength(int[] row) {
    int count = 0;
    for (int person : row) {
      count += person;
    }
    return count;
  }

  int[] weakestRows(int[][] mat, int threshold) {
    int[][] strengths = new int[mat.length][2];
    int[] output = new int[threshold];

    for (int i = 0; i < mat.length; i++) {
      strengths[i] = new int[]{i, findStrength(mat[i])};
    }
    Arrays.sort(strengths, new SortByStrength());
    for (int i = 0; i < threshold; i++) {
      output[i] = strengths[i][0];
    }
    return output;
  }
}
