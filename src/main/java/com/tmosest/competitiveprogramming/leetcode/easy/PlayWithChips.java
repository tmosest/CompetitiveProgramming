package com.tmosest.competitiveprogramming.leetcode.easy;

class PlayWithChips {

  int minCostToMoveChips(int[] chips) {
    int countOdd = 0;
    int countEven = 0;
    for (int pos : chips) {
      if (pos % 2 == 0) {
        countEven++;
      }
    }
    countOdd = chips.length - countEven;
    return Math.min(countEven, countOdd);
  }
}
