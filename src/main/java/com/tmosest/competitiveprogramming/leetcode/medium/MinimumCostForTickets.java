package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

class MinimumCostForTickets {

  private int[] costs;
  private Integer[] memo;
  private Set<Integer> dayset;

  int mincostTickets(int[] days, int[] costs) {
    this.costs = costs;
    memo = new Integer[366];
    dayset = new HashSet<>();
    for (int d : days) {
      dayset.add(d);
    }

    return dp(1);
  }

  private int dp(int index) {
    if (index > 365) {
      return 0;
    }
    if (memo[index] != null) {
      return memo[index];
    }

    int ans;
    if (dayset.contains(index)) {
      ans = Math.min(dp(index + 1) + costs[0],
          dp(index + 7) + costs[1]);
      ans = Math.min(ans, dp(index + 30) + costs[2]);
    } else {
      ans = dp(index + 1);
    }

    memo[index] = ans;
    return ans;
  }
}
