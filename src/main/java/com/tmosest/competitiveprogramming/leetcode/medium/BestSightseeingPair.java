package com.tmosest.competitiveprogramming.leetcode.medium;

class BestSightseeingPair {

  int maxScoreSightseeingPair(int[] arr) {
    int len = arr.length;
    int max = Integer.MIN_VALUE;
    int[] clone = arr.clone();

    for (int i = 1; i < len; i++) {
      arr[i] = Math.max(arr[i] + i, arr[i - 1]);
    }

    clone[len - 1] -= len - 1;
    max = Math.max(max, arr[len - 2] + clone[len - 1]);

    for (int j = len - 2; j > 0; j--) {
      clone[j] = Math.max(clone[j] - j, clone[j + 1]);
      max = Math.max(max, arr[j - 1] + clone[j]);
    }

    return max;
  }
}
