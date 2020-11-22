package com.tmosest.competitiveprogramming.leetcode.medium;

class WaysToMakeFairArray {

  int waysToMakeFair(int[] nums) {
    int res = 0;
    int len = nums.length;
    int righteven = 0;
    int rightodd = 0;

    for (int i = 0; i < len; ++i) {
      if (i % 2 == 0) {
        righteven += nums[i];
      } else {
        rightodd += nums[i];
      }
    }

    int lefteven = 0;
    int leftodd = 0;
    for (int i = 0; i < len; ++i) {

      if (i % 2 == 0) {
        righteven -= nums[i];
      } else {
        rightodd -= nums[i];
      }

      if (lefteven + rightodd == leftodd + righteven) {
        ++res;
      }

      if (i % 2 == 0) {
        lefteven += nums[i];
      } else {
        leftodd += nums[i];
      }
    }

    return res;
  }
}
