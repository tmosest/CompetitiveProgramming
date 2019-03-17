package com.tmosest.competitiveprogramming.leetcode;

public class CoinChange {

  private int minChange = Integer.MAX_VALUE;

  /**
   * Determine min number of coins needed to make change.
   * @param coins Coin values.
   * @param amount The amount to make change for.
   * @return The minimum number of coins needed.
   */
  public int coinChange(int[] coins, int amount) {
    coinChange(coins, amount, 0);
    return (minChange == Integer.MAX_VALUE) ? -1 : minChange;
  }

  private void coinChange(int[] coins, int amount, int numOfCoins) {
    if (amount == 0) {
      minChange = Math.min(numOfCoins, minChange);
      return;
    }
    if (amount < 0) {
      return;
    }
    for (int i = 0; i < coins.length; i++) {
      coinChange(coins, amount - coins[i], numOfCoins + 1);
    }
  }
}
