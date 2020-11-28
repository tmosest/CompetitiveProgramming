package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.Arrays;
import java.util.List;

class MinimumCostToConnectTwoGroupsOfPoints {

  int connectTwoGroups(List<List<Integer>> cost) {
    int cols = cost.size();
    int rows = cost.get(0).size();
    int[][] fill = new int[cols + 1][1 << rows];
    for (int i = 0; i <= cols; i++) {
      Arrays.fill(fill[i], Integer.MAX_VALUE / 2);
    }
    fill[0][0] = 0;
    for (int i = 0; i < cols; i++) {
      for (int s = 0; s < 1 << rows; s++) {
        for (int j = 0; j < rows; j++) {
          fill[i + 1][s | 1 << j] = Math.min(
              fill[i + 1][s | 1 << j],
              Math.min(
                  fill[i + 1][s] + cost.get(i).get(j),
                  fill[i][s] + cost.get(i).get(j)
              )
          );
        }
      }
    }
    return fill[cols][(1 << rows) - 1];
  }
}
