package com.tmosest.competitiveprogramming.leetcode;

class TwoCityScheduling {

  private int bestCost = 0;

  /**
   * Determine the min cost to get N people to each city.
   * @param costs The cost of each person to go to city A and city B.
   * @return The min cost.
   */
  int twoCitySchedCost(int[][] costs) {
    bestCost = Integer.MAX_VALUE;
    determineBest(costs, 0, 0, 0, 0);
    return bestCost;
  }

  private void determineBest(int[][] costs, int index, int countA, int countB, int cost) {
    if (index == costs.length) {
      if (countA == countB) {
        bestCost = Math.min(bestCost, cost);
      }
      return;
    }
    determineBest(costs, index + 1, countA + 1, countB, cost + costs[index][0]);
    determineBest(costs, index + 1, countA, countB + 1, cost + costs[index][1]);
  }
}
