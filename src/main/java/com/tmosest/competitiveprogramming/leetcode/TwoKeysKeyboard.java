package com.tmosest.competitiveprogramming.leetcode;

public class TwoKeysKeyboard {

  /**
   * Determine number of steps.
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
