package com.tmosest.competitiveprogramming.leetcode.medium;

class MaximumLengthOfRepeatedSubarray {

  int findLength(int[] one, int[] two) {
    int[][] dp = new int[one.length + 1][two.length + 1];
    int max = 0;
    for (int i = one.length - 1; i >= 0; i--) {
      for (int j = two.length - 1; j >= 0; j--) {
        if (one[i] == two[j]) {
          dp[i][j] = dp[i + 1][j + 1] + 1;
          max = Math.max(max, dp[i][j]);
        }
      }
    }

    return max;
  }
}
