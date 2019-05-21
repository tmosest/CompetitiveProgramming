package com.tmosest.competitiveprogramming.leetcode.easy;

class MinCostClimbingStairs {
  /* Write code here. */

  /**
   * Determine the min cost to reach the top given you can pick between two steps.
   *
   * @param cost Array of integers which are the costs.
   * @return The min cost to reach the top.
   */
  public int minCostClimbingStairs(int[] cost) {
    int stepOne = 0;
    int stepTwo = 0;
    for (int i = cost.length - 1; i >= 0; --i) {
      int f0 = cost[i] + Math.min(stepOne, stepTwo);
      stepTwo = stepOne;
      stepOne = f0;
    }
    return Math.min(stepOne, stepTwo);
  }


}
