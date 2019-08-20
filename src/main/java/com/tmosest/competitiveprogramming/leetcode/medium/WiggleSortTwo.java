package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class WiggleSortTwo {

  void wiggleSort(int[] nums) {
    if (nums == null || nums.length == 1) {
      return;
    }
    Arrays.sort(nums);
    if (nums.length == 2) {
      return;
    }
    int[] val = Arrays.copyOf(nums, nums.length);
    Arrays.sort(val);
    int idx = val.length - 1;
    for (int i = 1; i < nums.length; i += 2) {
      nums[i] = val[idx--];
    }
    for (int i = 0; i < nums.length; i += 2) {
      nums[i] = val[idx--];
    }
  }
}
