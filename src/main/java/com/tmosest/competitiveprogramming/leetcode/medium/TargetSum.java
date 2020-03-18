package com.tmosest.competitiveprogramming.leetcode.medium;

class TargetSum {

  private int count = 0;

  int findTargetSumWays(int[] nums, int target) {
    calculate(nums, 0, 0, target);
    return count;
  }

  private void calculate(int[] nums, int index, int sum, int target) {
    if (index == nums.length) {
      if (sum == target) {
        count++;
      }
    } else {
      calculate(nums, index + 1, sum + nums[index], target);
      calculate(nums, index + 1, sum - nums[index], target);
    }
  }
}
