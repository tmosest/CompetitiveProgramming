package com.tmosest.competitiveprogramming.leetcode.easy;

class NumberOfGoodPairs {

  int numIdenticalPairs(int[] nums) {
    // brute force solution
    int res = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          ++res;
        }
      }
    }

    return res;
  }
}
