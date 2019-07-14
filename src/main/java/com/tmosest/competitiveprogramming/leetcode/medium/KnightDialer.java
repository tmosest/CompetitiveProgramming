package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class KnightDialer {

  /**
   * Determine how many numbers can be dialed by a knight.
   *
   * @param len The number of moves.
   * @return The number of unique numbers.
   */
  int knightDialer(int len) {
    int mod = 1_000_000_007;
    int[][] moves = new int[][]{
        {4, 6}, {6, 8}, {7, 9}, {4, 8}, {3, 9, 0},
        {}, {1, 7, 0}, {2, 6}, {1, 3}, {2, 4}};

    int[][] dp = new int[2][10];
    Arrays.fill(dp[0], 1);
    for (int hops = 0; hops < len - 1; ++hops) {
      Arrays.fill(dp[~hops & 1], 0);
      for (int node = 0; node < 10; ++node) {
        for (int nei : moves[node]) {
          dp[~hops & 1][nei] += dp[hops & 1][node];
          dp[~hops & 1][nei] %= mod;
        }
      }
    }

    long ans = 0;
    for (int x : dp[~len & 1]) {
      ans += x;
    }
    return (int) (ans % mod);
  }
}
