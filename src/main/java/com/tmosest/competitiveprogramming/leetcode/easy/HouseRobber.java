package com.tmosest.competitiveprogramming.leetcode.easy;

class HouseRobber {
  /* Write code here. */

  /**
   * Determines the max amount of money a robber could make assuming they can't rob more than one
   * house in a row.
   *
   * @param num An array of numbers representing the amount a robber could get from each house.
   * @return The max amount they could steal.
   */
  public int rob(int[] num) {
    int prevMax = 0;
    int currMax = 0;
    for (int x : num) {
      int temp = currMax;
      currMax = Math.max(prevMax + x, currMax);
      prevMax = temp;
    }
    return currMax;
  }


}
