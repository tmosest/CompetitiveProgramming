package com.tmosest.competitiveprogramming.leetcode.easy;

class MinimumValueToGetPositiveStepByStepSum {

  int minStartValue(int[] nums) {
    int min = Integer.MAX_VALUE;
    int prefixSum = 0;
    for (int num : nums) {
      prefixSum += num;
      min = Math.min(min, prefixSum);
    }

    if (min >= 0) {
      return 1;
    }

    return (min - 1) * -1;
  }
}
