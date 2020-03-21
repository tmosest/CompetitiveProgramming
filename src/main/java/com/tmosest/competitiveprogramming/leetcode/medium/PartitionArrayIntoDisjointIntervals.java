package com.tmosest.competitiveprogramming.leetcode.medium;

class PartitionArrayIntoDisjointIntervals {

  int partitionDisjoint(int[] arr) {
    int max = arr[0];
    int allMax = arr[0];
    int solution = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < max) {
        solution = i + 1;
        max = allMax;
      } else {
        allMax = Math.max(allMax, arr[i]);
      }
    }
    return solution;
  }
}
