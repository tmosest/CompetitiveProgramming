package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;

class TwoCityScheduling {

  /**
   * Determine the min cost to get N people to each city.
   * @param costs The cost of each person to go to city A and city B.
   * @return The min cost.
   */
  int twoCitySchedCost(int[][] costs) {
    Arrays.sort(costs, (one, two) -> ((one[0] - one[1]) - (two[0] - two[1])));
    int res = 0;
    for (int i = 0; i < costs.length / 2; i++) {
      res += (costs[i][0] + costs[costs.length - 1 - i][1]);
    }
    return res;
  }
}
