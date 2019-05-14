package com.tmosest.competitiveprogramming.leetcode.easy;

class PaintFence {
  /* Write code here. */

  /**
   * Number of ways to paint a fence with different colors that are not allowed to be adjacent.
   *
   * @param fences Number of fence posts.
   * @param colors The number of colors.
   * @return The number of distinct ways.
   */
  public int numWays(int fences, int colors) {
    if (fences == 0) {
      return 0;
    }

    int[] diff = new int[fences];
    int[] same = new int[fences];

    same[0] = 0;
    diff[0] = colors;

    for (int i = 1; i < fences; i++) {
      same[i] = diff[i - 1];
      diff[i] = (colors - 1) * same[i - 1] + (colors - 1) * diff[i - 1];
    }
    return same[fences - 1] + diff[fences - 1];
  }


}
