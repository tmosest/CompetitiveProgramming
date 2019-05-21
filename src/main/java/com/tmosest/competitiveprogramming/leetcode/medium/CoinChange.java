package com.tmosest.competitiveprogramming.leetcode.medium;

class CoinChange {
  /* Write code here. */

  /**
   * Determine min number of coins needed to make change.
   *
   * @param coins Coin values.
   * @param amount The amount to make change for.
   * @return The minimum number of coins needed.
   */
  public int coinChange(int[] coins, int amount) {
    if (amount < 1) {
      return 0;
    }
    return coinChange(coins, amount, new int[amount]);
  }

  private int coinChange(int[] coins, int amount, int[] count) {
    if (amount < 0) {
      return -1;
    }
    if (amount == 0) {
      return 0;
    }
    if (count[amount - 1] != 0) {
      return count[amount - 1];
    }
    int min = Integer.MAX_VALUE;
    for (int coin : coins) {
      int res = coinChange(coins, amount - coin, count);
      if (res >= 0 && res < min) {
        min = 1 + res;
      }
    }
    count[amount - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
    return count[amount - 1];
  }


}
