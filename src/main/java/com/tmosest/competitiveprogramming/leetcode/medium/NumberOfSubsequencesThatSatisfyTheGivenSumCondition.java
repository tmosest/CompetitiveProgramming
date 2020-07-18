package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {

  int numSubseq(int[] nums, int target) {
    Arrays.sort(nums);
    int ans = 0;
    int num = nums.length;
    int mod = (int)(1e9 + 7);
    int[] pows = new int[num];
    pows[0] = 1;
    for (int i = 1; i < num; i++) {
      pows[i] = (pows[i - 1] * 2) % mod;
    }
    int one = 0;
    int two = num - 1;
    while (one <= two) {
      if (nums[one] + nums[two] <= target) {
        ans = (ans + pows[two - one]) % mod;
        one++;
      } else {
        two--;
      }
    }
    return ans;
  }
}
