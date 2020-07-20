package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MinimumNumberOfDaysToMakeBouquets {

  int minDays(int[] bloomDay, int bouquets, int adjacent) {
    int lo = 1;
    int hi = Arrays.stream(bloomDay).max().getAsInt();
    int optimalValue = 0;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (canMakeMFlowers(bloomDay, bouquets, adjacent, mid)) {
        // on day = mid, we can make more than or equals to M bouquets
        // reduce the day to get the nearest value to m
        optimalValue = mid;
        hi = mid - 1;
      } else {
        // we could not make enough bouquet on current day, so day has to
        // increased
        lo = mid + 1;
      }
    }
    return optimalValue == 0 ? -1 : optimalValue;
  }

  /*
   * method to check whether we can make minimum K bouquets on a particular day or not
   */
  private boolean canMakeMFlowers(int[] bloomDay, int one, int two, int day) {
    int bloomedFlowerCount = 0;
    int bouquets = 0;
    for (int bloom : bloomDay) {
      if (day >= bloom) {
        bloomedFlowerCount++;
      } else {
        // we need consecutive flowers, since this flower didn't bloom
        // on current day so reset the bloomedFlowerCount
        bloomedFlowerCount = 0;
      }
      if (bloomedFlowerCount == two) {
        // found consecutive flowers than are bloomed at dayth day
        bouquets++;
        bloomedFlowerCount = 0;
        // another optimization
        if (bouquets >= one) {
          return true;
        }
      }
    }
    return bouquets >= one;
  }
}
