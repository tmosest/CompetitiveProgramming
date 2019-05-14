package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashMap;

class NumberOfBoomerangs {
  /* Write code here. */

  /**
   * Determine the number of boomerang throws needed.
   *
   * @param points The points to cover.
   * @return The number of throw.
   */
  public int numberOfBoomerangs(int[][] points) {
    int count = 0;
    for (int[] p : points) {
      HashMap<Double, Integer> maps = new HashMap<>();
      for (int[] pair : points) {
        double dist = (p[0] - pair[0]) * (p[0] - pair[0]) + (p[1] - pair[1]) * (p[1] - pair[1]);
        int temp = maps.getOrDefault(dist, 0);
        if (maps.containsKey(dist)) {
          count = count + 2 * temp;
        }
        maps.put(dist, temp + 1);
      }
    }
    return count;
  }


}
