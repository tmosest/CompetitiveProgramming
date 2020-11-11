package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class GetMaximumInGeneratedArray {

  int getMaximumGenerated(int num) {
    if (num == 0) {
      return 0;
    }
    if (num <= 2) {
      return 1;
    }
    int[] array = new int[num + 1];
    array[0] = 0;
    array[1] = 1;
    for (int i = 2; i < array.length; i++) {
      if (i % 2 == 0) {
        array[i] = array[i / 2];
      } else {
        array[i] = array[i / 2] + array[i / 2 + 1];
      }
    }

    Arrays.sort(array);
    return array[array.length - 1];
  }
}
