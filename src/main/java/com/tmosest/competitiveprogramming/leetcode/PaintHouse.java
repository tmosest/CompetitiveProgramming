package com.tmosest.competitiveprogramming.leetcode;

public class PaintHouse {

  /**
   * Function to compute the min cost of painting a set of houses.
   * @param costs A matrix of costs per house per color.
   * @return The min cost to paint all the houses.
   */
  public int minCost(int[][] costs) {
    if (costs == null || costs.length == 0 || costs[0].length == 0) {
      return 0;
    }

    int min = Integer.MAX_VALUE;

    for (int i = 0; i < costs[0].length; i++) {
      min = Math.min(min, minCost(costs, 1, i, costs[0][i]));
    }

    return min;
  }

  private int minCost(int[][] costs, int index, int previousColor, int cost) {
    if (index >= costs.length) {
      return cost;
    }
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < costs[index].length; i++) {
      if (i != previousColor) {
        min = Math.min(min, minCost(costs, index + 1, i, cost + costs[index][i]));
      }
    }
    return min;
  }
}
