package com.tmosest.competitiveprogramming.leetcode;

public class KokoEatingBananas {

  /**
   * Determine the minimum number of bananas that need to be eaten per hour.
   * @param piles The piles of bananas.
   * @param hours The hours the trainer will be gone.
   * @return The min bananas per hour that will deplete all the bananas.
   */
  public int minEatingSpeed(int[] piles, int hours) {
    int lo = 1;
    int hi = 1_000_000_000;
    while (lo < hi) {
      int mi = (lo + hi) / 2;
      if (!possible(piles, hours, mi)) {
        lo = mi + 1;
      } else {
        hi = mi;
      }
    }
    return lo;
  }

  private boolean possible(int[] piles, int hours, int banasPerHour) {
    int time = 0;
    for (int p : piles) {
      time += (p - 1) / banasPerHour + 1;
    }
    return time <= hours;
  }
}
