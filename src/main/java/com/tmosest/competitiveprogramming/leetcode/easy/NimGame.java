package com.tmosest.competitiveprogramming.leetcode.easy;

class NimGame {
  /* Write code here. */

  /**
   * Function to determine if you can win nim.
   *
   * @param stones The number of stones.
   * @return True if you can win.
   */
  public boolean canWinNim(int stones) {
    return stones % 4 != 0;
  }


}
