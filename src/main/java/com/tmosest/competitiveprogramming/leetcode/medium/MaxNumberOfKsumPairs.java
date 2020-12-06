package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MaxNumberOfKsumPairs {

  int maxOperations(int[] nums, int target) {
    Arrays.sort(nums);

    int count = 0;
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int sum = nums[left] + nums[right];
      if (sum > target) {
        right--;
      } else if (sum == target) {
        count++;
        right--;
        left++;
      } else {
        left++;
      }
    }

    return count;
  }
}
