package com.tmosest.competitiveprogramming.leetcode.medium;

class LongestCommonSubsequence {

  /**
   * Determine longest Common Subsequence.
   *
   * @param text1 The first string.
   * @param text2 The second string.
   * @return The length of the longest common subsequence.
   */
  public int longestCommonSubsequence(String text1, String text2) {
    int first = text1.length();
    int second = text2.length();
    int[][] dp = new int[first + 1][second + 1];
    for (int i = 1; i <= first; i++) {
      for (int j = 1; j <= second; j++) {
        if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
        } else {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }
    return dp[first][second];
  }
}
