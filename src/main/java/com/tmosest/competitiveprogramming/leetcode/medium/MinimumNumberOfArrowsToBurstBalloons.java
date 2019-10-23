package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

class MinimumNumberOfArrowsToBurstBalloons {

  int findMinArrowShots(int[][] points) {
    if (points == null || points.length == 0) {
      return 0;
    }
    Arrays.sort(points, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        if (o1[0] != o2[0]) {
          return o1[0] - o2[0];
        } else {
          return o1[1] - o2[1];
        }
      }
    });

    int start = points[0][0];
    int end = points[0][1];
    int arrowNum = 1;
    for (int i = 1; i < points.length; i++) {
      if (points[i][0] > end) {
        start = points[i][0];
        end = points[i][1];
        arrowNum++;
      } else {
        start = Math.max(start, points[i][0]);
        end = Math.min(end, points[i][1]);
      }
    }
    return arrowNum;
  }
}
