package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

class DistributeCandies {
  /* Write code here. */

  /**
   * Determine max number of candies one person could get given equal distribution.
   *
   * @param candies An array of integers where different numbers are different candies.
   * @return The max number of different candies one person could get.
   */
  public int distributeCandies(int[] candies) {
    Set<Integer> set = new HashSet<>();
    for (int candy : candies) {
      set.add(candy);
    }
    return Math.min(set.size(), candies.length / 2);
  }


}
