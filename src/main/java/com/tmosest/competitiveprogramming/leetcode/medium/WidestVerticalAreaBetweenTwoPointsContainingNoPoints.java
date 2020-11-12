package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {

  int maxWidthOfVerticalArea(int[][] points) {
    int[] arr = new int[points.length];

    // Pick x co-ordinates of every point
    for (int i = 0; i < points.length; i++) {
      arr[i] = points[i][0];
    }

    Arrays.sort(arr);
    int maxDistance = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      maxDistance = Math.max(maxDistance, arr[i + 1] - arr[i]);
    }

    return maxDistance;
  }
}
