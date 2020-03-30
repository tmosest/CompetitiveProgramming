package com.tmosest.competitiveprogramming.leetcode.medium;

class FindLuckyIntegerInAnArray {

  private static final int MAX_NUMBER = 500;

  int findLucky(int[] arr) {

    int[] counts = new int[MAX_NUMBER + 1];

    for (int val : arr) {
      counts[val]++;
    }

    for (int i = counts.length - 1; i > 0; i--) {
      if (counts[i] == i) {
        return i;
      }
    }

    return -1;
  }
}
