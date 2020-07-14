package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class CanMakeArithmeticProgressionFromSequence {

  boolean canMakeArithmeticProgression(int[] arr) {
    Arrays.sort(arr);
    if (arr.length < 2) {
      return true;
    }

    int diff = arr[1] - arr[0];

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i + 1] - arr[i] != diff) {
        return false;
      }
    }

    return true;
  }
}
