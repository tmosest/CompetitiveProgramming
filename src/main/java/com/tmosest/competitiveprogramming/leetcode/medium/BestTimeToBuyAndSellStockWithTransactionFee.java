package com.tmosest.competitiveprogramming.leetcode.medium;

class BestTimeToBuyAndSellStockWithTransactionFee {

  private int len = 0;

  /**
   * Best time to buy and sell stock with fees.
   *
   * @param prices The prices.
   * @param fee The fee.
   * @return The max profit.
   */
  int maxProfit(int[] prices, int fee) {
    len = prices.length;
    int[] maxHold = new int[len + 1];
    int[] maxCash = new int[len + 1];

    maxHold[0] = Integer.MIN_VALUE;
    maxCash[0] = 0;
    maxCash[1] = 0;
    for (int i = 1; i < len + 1; i++) {
      maxHold[i] = Math.max(maxCash[i - 1] - prices[i - 1], maxHold[i - 1]);
      if (i > 1) {
        maxCash[i] = Math.max(maxHold[i - 1] + prices[i - 1] - fee, maxCash[i - 1]);
      }
    }

    return maxCash[len];
  }
}
