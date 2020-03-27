package com.tmosest.competitiveprogramming.leetcode.medium;

class GreatestSumDivisibleByThree {

  int maxSumDivThree(int[] nums) {

    int len = nums.length;
    int[][] cache = new int[len][3];

    cache[0][nums[0] % 3] = nums[0];

    for (int i = 1; i < len; i++) {
      for (int j = 0; j < 3; j++) {

        int num = cache[i - 1][j] + nums[i];

        int pos = num % 3;

        cache[i][pos] = Math.max(num, cache[i][pos]);

        cache[i][j] = Math.max(cache[i][j], cache[i - 1][j]);

      }
    }

    return cache[len - 1][0];

  }
}
