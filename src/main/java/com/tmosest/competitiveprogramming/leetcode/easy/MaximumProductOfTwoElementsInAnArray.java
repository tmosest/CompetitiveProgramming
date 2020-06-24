package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class MaximumProductOfTwoElementsInAnArray {

  int maxProduct(int[] nums) {
    Arrays.sort(nums);
    int len = nums.length;
    int num = (nums[len - 1] - 1) * (nums[len - 2] - 1);
    return num;
  }
}
