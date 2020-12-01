package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MinimumMovesToMakeArrayComplementary {

  int minMoves(int[] nums, int limit) {
    int[] delta = new int[2 * limit + 2];
    Arrays.fill(delta, 0);
    int len = nums.length;
    for (int i = 0; i < len / 2; i++) {
      int temp = nums[i];
      int next = nums[len - 1 - i];
      delta[2] += 2;
      delta[Math.min(temp, next) + 1]--;
      delta[temp + next]--;
      delta[temp + next + 1]++;
      delta[Math.max(temp, next) + limit + 1]++;
    }
    int res = 2 * len;
    int curr = 0;
    for (int i = 2; i <= 2 * limit; i++) {
      curr += delta[i];
      res = Math.min(res, curr);
    }
    return res;
  }
}
