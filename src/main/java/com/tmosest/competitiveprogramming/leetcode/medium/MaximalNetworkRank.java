package com.tmosest.competitiveprogramming.leetcode.medium;

class MaximalNetworkRank {

  int maximalNetworkRank(int nodes, int[][] roads) {
    int[][] connected = new int[nodes][nodes];
    int[] numberOfCities = new int[nodes];
    for (int[] r : roads) {
      numberOfCities[r[0]]++;
      numberOfCities[r[1]]++;
      connected[r[0]][r[1]]--;
      connected[r[1]][r[0]]--;
    }

    int max = 0;
    for (int i = 0; i < nodes; i++) {
      for (int j = i + 1; j < nodes; j++) {
        max = Math.max(max, numberOfCities[i] + numberOfCities[j] + connected[i][j]);
      }
    }
    return max;
  }
}
