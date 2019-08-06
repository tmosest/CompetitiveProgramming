package com.tmosest.competitiveprogramming.leetcode.medium;

class CarPooling {

  boolean carPooling(int[][] trips, int capacity) {
    int maxDist = 1000;
    int[] starts = new int[maxDist + 1];
    int[] ends = new int[maxDist + 1];
    for (int[] trip : trips) {
      starts[trip[1]] += trip[0];
      ends[trip[2]] += trip[0];
    }
    int total = 0;
    for (int i = 0; i <= maxDist; i++) {
      total += starts[i] - ends[i];
      if (total > capacity) {
        return false;
      }
    }
    return true;
  }
}
