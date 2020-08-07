package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class FindTheCityWithTheSmallestNumberOfNeighborsAtThresholdDistance {

  int findTheCity(int len, int[][] edges, int distanceThreshold) {
    int[][] table = new int[len][len];

    for (int i = 0; i < len; i++) {
      Arrays.fill(table[i], 10001);
      // We used 10001 as the max value is 10^4 . we can use integer.maxValue  but then we have to
      //use float table instead to int as int will overflow when we try to add to Integer.Max_VALUE;
      table[i][i] = 0;
    }

    // Initializing the table with intial weights.

    for (int i = 0; i < edges.length; i++) {
      table[edges[i][0]][edges[i][1]] = edges[i][2];
      table[edges[i][1]][edges[i][0]] = edges[i][2];
    }

    for (int i = 0; i < len; i++) { // Via this node ;

      for (int j = 0; j < table.length; j++) {
        for (int k = 0; k < table[j].length; k++) {
          // travel from j to k via node i;
          // check if distanct via node i is less than or not and if yes then update it.
          // if(table[j][k] > table[j][i]+table[i][k]){
          //     table[j][k] = table[j][i] + table[i][k];
          //
          if (i == j) {
            break;
          }
          if (j != k) {
            table[j][k] = Math.min(table[j][k], (table[j][i] + table[i][k]));
          }
        }
      }
    }
    int min = Integer.MAX_VALUE;
    int index = 0;

    for (int i = 0; i < len; i++) {
      int temp = 0;
      for (int j = 0; j < len; j++) {
        if (i != j && table[i][j] <= distanceThreshold) {
          temp++;
        }
      }
      if (temp <= min) {
        min = temp;
        index = i;
      }
    }
    return index;
  }
}
