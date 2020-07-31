package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class ReduceArraySizeToTheHalf {

  int minSetSize(int[] arr) {
    int[] nums = new int[arr.length];
    int pos = 0;
    Arrays.sort(arr);

    int prev = arr[0];
    nums[pos]++;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != prev) {
        nums[++pos]++;
        prev = arr[i];
      } else {
        nums[pos]++;
      }
    }
    Arrays.sort(nums, 0, ++pos);

    int sum = 0;
    int ctr = 0;

    for (int i = pos - 1; i >= 0; --i) {
      sum += nums[i];
      ctr++;
      if (arr.length - sum <= (arr.length / 2)) {
        return ctr;
      }
    }
    return arr.length;
  }
}
