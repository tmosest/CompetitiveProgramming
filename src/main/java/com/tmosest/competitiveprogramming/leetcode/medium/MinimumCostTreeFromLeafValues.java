package com.tmosest.competitiveprogramming.leetcode.medium;

class MinimumCostTreeFromLeafValues {

  int mctFromLeafValues(int[] arr) {
    int[][] cache = new int[arr.length][arr.length];
    int[][] max = new int[arr.length][arr.length];
    for (int i = 0; i < arr.length; i++) {
      cache[i][i] = 0;
      max[i][i] = arr[i];
    }

    for (int k = 2; k <= arr.length; k++) {
      for (int i = 0; i <= arr.length - k; i++) {
        cache[i][i + k - 1] = Integer.MAX_VALUE;
        for (int j = 1; j < k; j++) {
          cache[i][i + k - 1] = Math.min(cache[i][i + k - 1],
              cache[i][i + j - 1] + cache[i + j][i + k - 1] + max[i][i + j - 1] * max[i + j][i + k
                  - 1]);
        }
        max[i][i + k - 1] = Math.max(max[i][i], max[i + 1][i + k - 1]);
      }
    }
    return cache[0][arr.length - 1];
  }
}
