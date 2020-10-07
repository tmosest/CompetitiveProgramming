package com.tmosest.competitiveprogramming.leetcode.easy;

class SpecialArrayWithTenElementsGreaterThanOrEqualTen {

  int specialArray(int[] nums) {
    int[] counts = new int[nums.length];

    for (int num : nums) {
      for (int i = 1; i <= counts.length; i++) {
        if (num >= i) {
          counts[i - 1]++;
        }
      }
    }

    for (int i = 0; i < counts.length; i++) {
      if (counts[i] == i + 1) {
        return i + 1;
      }
    }

    return -1;
  }
}
