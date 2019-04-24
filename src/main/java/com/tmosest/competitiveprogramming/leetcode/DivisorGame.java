package com.tmosest.competitiveprogramming.leetcode;

public class DivisorGame {

  /**
   * Determine if Alison could win the game.
   * @param num The starting number.
   * @return True if Alison could win.
   */
  boolean divisorGame(int num) {
    if (num == 1) {
      return false;
    }
    boolean flag = false;
    for (int x = 1; x < num && num % x == 0; x++) {
      flag = flag || ! divisorGame(num - x);
    }
    return flag;
  }
}
