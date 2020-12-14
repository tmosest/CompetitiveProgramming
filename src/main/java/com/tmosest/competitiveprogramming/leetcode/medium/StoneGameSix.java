package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class StoneGameSix {

  int stoneGame6(int[] aliceValues, int[] bobValues) {
    int len = aliceValues.length;
    int[][] sums = new int[len][];
    for (int i = 0; i < len; i++) {
      sums[i] = new int[]{aliceValues[i] + bobValues[i], aliceValues[i], bobValues[i]};
    }
    Arrays.sort(sums, (one, two) -> Integer.compare(two[0], one[0]));
    int one = 0;
    int two = 0;
    for (int i = 0; i < len; i++) {
      if (i % 2 == 0) {
        one += sums[i][1];
      } else {
        two += sums[i][2];
      }
    }
    return Integer.compare(one, two);
  }
}
