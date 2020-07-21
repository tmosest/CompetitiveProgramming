package com.tmosest.competitiveprogramming.leetcode.easy;

class ShuffleTheArray {

  int[] shuffle(int[] nums, int size) {
    int[] res = new int[nums.length];

    int offset = 0;

    for (int i = 0; i < nums.length; i++) {
      if (i % 2 == 0) {
        res[i] = nums[offset];
      } else {
        res[i] = nums[size + offset];
        ++offset;
      }
    }

    return res;
  }
}
