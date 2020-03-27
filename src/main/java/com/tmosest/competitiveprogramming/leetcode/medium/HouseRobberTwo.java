package com.tmosest.competitiveprogramming.leetcode.medium;

class HouseRobberTwo {

  int rob(int[] nums) {
    int len = nums.length;

    if (len == 0) {
      return 0;
    }
    if (len == 1) {
      return nums[len - 1];
    }
    if (len == 2) {
      return Math.max(nums[len - 1], nums[len - 2]);
    }
    if (len == 3) {
      return Math.max(nums[len - 1], Math.max(nums[len - 2], nums[len - 3]));
    }

    int[] memo1 = new int[len + 1];
    memo1[0] = 0;
    memo1[1] = nums[0];

    int ans = 0;
    for (int i = 2; i < len; i++) {
      memo1[i] = Math.max(nums[i - 1] + memo1[i - 2], memo1[i - 1]);
      ans = Math.max(memo1[i], ans);
    }

    int[] memo2 = new int[len + 1];
    memo2[0] = 0;
    memo2[1] = 0;

    for (int i = 2; i <= len; i++) {
      memo2[i] = Math.max(nums[i - 1] + memo2[i - 2], memo2[i - 1]);
      ans = Math.max(memo2[i], ans);
    }
    return ans;
  }
}
