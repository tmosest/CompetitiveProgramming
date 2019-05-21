package com.tmosest.competitiveprogramming.leetcode.easy;

class PoorPigs {
  /* Write code here. */

  /**
   * Determine number of pigs needed to drink poison.
   *
   * @param buckets Number of buckets.
   * @param minutesToDie Time after drinking when pig will ide
   * @param minutesToTest The number of minutes allowed to test.
   * @return The number of pigs needed.
   */
  public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
    int pigs = 0;
    while (Math.pow(minutesToTest / minutesToDie + 1, pigs++) < buckets) {
    }
    return pigs - 1;
  }


}
