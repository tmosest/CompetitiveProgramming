package com.tmosest.competitiveprogramming.leetcode.easy;

class PaintHouse {
  /* Write code here. */

  /**
   * Function to compute the min cost of painting a set of houses. Uses a dynamic approach to the
   * problem.
   *
   * @param costs A matrix of costs per house per color.
   * @return The min cost to paint all the houses.
   */
  public int minCost(int[][] costs) {
    if (costs == null || costs.length == 0 || costs[0].length == 0) {
      return 0;
    }

    int red = costs[0][0];
    int blue = costs[0][1];
    int green = costs[0][2];

    for (int i = 1; i < costs.length; i++) {
      int prevRed = red;
      int prevBlue = blue;
      int prevGreen = green;
      red = costs[i][0] + Math.min(prevBlue, prevGreen);
      blue = costs[i][1] + Math.min(prevRed, prevGreen);
      green = costs[i][2] + Math.min(prevRed, prevBlue);
    }

    return Math.min(red, Math.min(blue, green));
  }


}
