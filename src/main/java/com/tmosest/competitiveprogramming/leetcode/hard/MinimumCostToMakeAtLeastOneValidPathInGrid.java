package com.tmosest.competitiveprogramming.leetcode.hard;

class MinimumCostToMakeAtLeastOneValidPathInGrid {

  int[] closestDivisors(int nums) {
    int max;
    for (int i = 0; ; i++) {
      if (i * i >= nums + 2) {
        max = i;
        break;
      }
    }
    return met(nums + 1, nums + 2, max);
  }

  private int[] met(int one, int two, int max) {
    int[] ans = new int[2];
    for (int i = max; i > 0; i--) {
      if (one % i == 0) {
        ans[0] = i;
        ans[1] = one / ans[0];
        return ans;
      } else if (two % i == 0) {
        ans[0] = i;
        ans[1] = two / ans[0];
        return ans;
      }
    }
    return ans;
  }
}
