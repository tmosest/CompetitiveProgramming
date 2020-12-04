package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class MeanOfArrayAfterRemovingSomeElements {

  double trimMean(int[] arr) {
    Arrays.sort(arr);
    int five = ((arr.length) * 5) / 100;

    double sum = 0.0;

    for (int i = five; i < arr.length - five; i++) {
      sum += arr[i];
    }

    return sum / (arr.length - 2 * five);
  }
}
