package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashSet;

class MaximumXorOfTwoNumbersInAnArray {

  int findMaximumXor(int[] nums) {
    int maximum = 0;
    int mask = 0;
    for (int i = 30; i >= 0; i--) {
      int one = 1 << i;
      mask = mask | one;
      HashSet<Integer> set = new HashSet<>();
      for (int num : nums) {
        set.add(mask & num);
      }
      for (int val : set) {
        if (set.contains(val ^ (maximum | one))) {
          maximum = maximum | one;
          break;
        }
      }
    }
    return maximum;
  }
}
