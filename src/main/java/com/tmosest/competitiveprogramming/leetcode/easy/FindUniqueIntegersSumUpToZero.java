package com.tmosest.competitiveprogramming.leetcode.easy;

class FindUniqueIntegersSumUpToZero {

  int[] sumZero(int num) {
    int[] arr = new int[num];
    for (int i = 0; i < num - 1; i += 2) {
      arr[i] = i + 1;
      arr[i + 1] = -arr[i];
    }
    return arr;
  }
}
