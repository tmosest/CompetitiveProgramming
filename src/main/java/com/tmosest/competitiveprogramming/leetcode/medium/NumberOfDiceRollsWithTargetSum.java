package com.tmosest.competitiveprogramming.leetcode.medium;

class NumberOfDiceRollsWithTargetSum {

  int numRollsToTarget(int dice, int faces, int target) {
    int[][] ans = new int[dice + 1][target + 1];
    ans[0][0] = 1;
    int mod = 1000000007;
    for (int i = 1; i < dice + 1; i++) {
      for (int j = 1; j < target + 1; j++) {
        int temp = 1;
        while (temp <= Math.min(faces, j)) {
          ans[i][j] = (ans[i][j] + ans[i - 1][j - temp]) % mod;
          temp++;
        }
      }
    }
    return ans[dice][target];
  }
}
