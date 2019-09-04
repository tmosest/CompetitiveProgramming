package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class PartitionEqualSubsetSum {

  boolean canPartition(int[] nums) {
    if (nums == null || nums.length == 0) {
      return true;
    }

    int sum = 0;
    for (int n : nums) {
      sum += n;
    }

    if (sum % 2 == 1) {
      return false;
    }
    int target = sum / 2;

    // dynamic programming.. induced from recursion
    // f[i][j] means:
    // is it able to get to target sum i by using the numbers from
    // the subarray [j .. end] ?
    boolean[][] arr = new boolean[1 + target][nums.length + 1];
    Arrays.fill(arr[0], true);

    for (int i = 1; i < arr.length; ++i) {
      for (int j = nums.length - 1; j >= 0; --j) {
        // not use the number at index j
        arr[i][j] = arr[i][j + 1];

        // use the number at index j
        if (!arr[i][j]) {
          arr[i][j] = i >= nums[j] ? arr[i - nums[j]][j + 1] : false;
        }
      }
    }

    return arr[target][0];
  }

}
