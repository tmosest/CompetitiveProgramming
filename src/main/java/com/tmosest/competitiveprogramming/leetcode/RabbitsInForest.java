package com.tmosest.competitiveprogramming.leetcode;

class RabbitsInForest {

  /**
   * Determine the number of rabbits in the forrest.
   * @param answers The answers the rabbits gave.
   * @return The number of rabbits in the forest.
   */
  int numRabbits(int[] answers) {
    int[] count = new int[1000];
    for (int x : answers) {
      count[x]++;
    }
    int ans = 0;
    for (int k = 0; k < 1000; k++) {
      ans += Math.floorMod(-count[k], k + 1) + count[k];
    }
    return ans;
  }
}
