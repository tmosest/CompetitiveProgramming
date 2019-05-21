package com.tmosest.competitiveprogramming.leetcode.medium;

class TwoKeysKeyboard {
  /* Write code here. */

  /**
   * Determine number of steps.
   *
   * @param steps The number of moves.
   * @return Then number of A's on the screen.
   */
  public int minSteps(int steps) {
    int ans = 0;
    int div = 2;
    while (steps > 1) {
      while (steps % div == 0) {
        ans += div;
        steps /= div;
      }
      div++;
    }
    return ans;
  }


}
