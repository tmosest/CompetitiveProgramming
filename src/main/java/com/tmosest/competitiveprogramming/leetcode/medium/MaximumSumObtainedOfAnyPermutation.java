package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MaximumSumObtainedOfAnyPermutation {

  int maxSumRangeQuery(int[] nums, int[][] requests) {
    int len = nums.length;
    int[] cnt = new int[len];
    for (int[] r : requests) {
      cnt[r[0]]++;
      if (r[1] + 1 < len) {
        cnt[r[1] + 1]--;
      }
    }
    for (int i = 1; i < len; i++) {
      cnt[i] += cnt[i - 1];
    }
    Arrays.sort(cnt);
    Arrays.sort(nums);
    long ans = 0;
    for (int i = len - 1; i >= 0 && cnt[i] > 0; i--) {
      ans += (long) cnt[i] * nums[i];
    }
    return (int) (ans % 1000000007);
  }
}
