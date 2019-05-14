package com.tmosest.competitiveprogramming.leetcode.easy;

class ArrangingCoins {
  /* Write code here. */

  /**
   * Count the number of rows in a stair case that can be made.
   *
   * @param numCoins The number of coins to use.
   * @return The number of step.
   */
  public int arrangeCoins(int numCoins) {
    int rows = 0;
    while (numCoins > 0) {
      numCoins -= (rows + 1);
      if (numCoins >= 0) {
        ++rows;
      }
    }
    return rows;
  }


}
