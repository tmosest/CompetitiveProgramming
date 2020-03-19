package com.tmosest.competitiveprogramming.leetcode.medium;

class StoneGameTwo {

  int stoneGameTwo(int[] piles) {
    int[][] dp = new int[piles.length][300];
    int totalSum = 0;
    for (int pile : piles) {
      totalSum += pile;
    }
    return findMax(piles, 0, dp, 1, totalSum);
  }

  private int findMax(int[] piles, int index, int[][] dp, int move, int totalSum) {
    if (index >= piles.length) {
      return 0;
    }
    if (dp[index][move] > 0) {
      return dp[index][move];
    }
    int localMax = 0;
    int sum = 0;
    for (int j = index; j < Math.min(piles.length, index + 2 * move); j++) {
      sum += piles[j];
      localMax = Math.max(localMax,
          totalSum - findMax(piles, j + 1, dp, Math.max(move, j + 1 - index), totalSum - sum));
    }
    dp[index][move] = localMax;
    return dp[index][move];
  }
}
