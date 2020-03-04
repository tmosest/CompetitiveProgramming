package com.tmosest.competitiveprogramming.leetcode.medium;

class MinimumSizeSubarraySum {

  int minSubArrayLen(int sum, int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int minSize = Integer.MAX_VALUE;
    int startIndex = 0;
    int endIndex = 0;
    int tmpSum = nums[0];
    if (tmpSum >= sum) {
      return 1;
    }
    while (endIndex < nums.length) {
      if (tmpSum >= sum) {
        minSize = Math.min(minSize, endIndex - startIndex + 1);
        tmpSum -= nums[startIndex];
        startIndex++;
      } else {
        endIndex++;
        if (endIndex != nums.length) {
          tmpSum += nums[endIndex];
        }
      }
    }
    return minSize < Integer.MAX_VALUE ? minSize : 0;
  }
}
