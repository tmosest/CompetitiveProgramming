package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MinimumMovesToEqualArrayElementsTwo {

  int minMoves2(int[] nums) {
    Arrays.sort(nums);
    int median = nums[nums.length / 2];
    int moves = 0;
    for (int num : nums) {
      int diff = Math.abs(median - num);
      moves += diff;
    }
    return moves;
  }
}
