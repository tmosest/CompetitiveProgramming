package com.tmosest.competitiveprogramming.leetcode.advent;

class TheTreacheryOfWhales {

  int getFuelCount(int[] input, boolean isCumulative) {
    int minPos = Integer.MAX_VALUE;
    int avg = getAvg(input);
    for (int i = getMin(input); i < avg + 1; i++) {
      int pos = 0;
      for (int num : input) {
        int diff = Math.abs(num - i);
        pos += (isCumulative) ? ((diff * (diff + 1)) / 2) : diff;
      }
      minPos = Math.min(minPos, pos);
    }
    return minPos;
  }

  private int getAvg(int[] input) {
    double sum = 0.0;

    for (int i : input) {
      sum += i;
    }

    return (int) Math.ceil(sum / input.length);
  }

  private int getMin(int[] input) {
    int min = Integer.MAX_VALUE;
    for (int i : input) {
      min = Math.min(i, min);
    }
    return min;
  }
}
