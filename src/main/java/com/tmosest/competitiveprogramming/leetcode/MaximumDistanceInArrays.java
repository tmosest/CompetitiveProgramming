package com.tmosest.competitiveprogramming.leetcode;

import java.util.List;

public class MaximumDistanceInArrays {

  /**
   * Determine max distance between lists.
   * @param arrays The matrix.
   * @return The max distance.
   */
  public int maxDistance(List<List<Integer>> arrays) {
    int[][] arr = new int[arrays.size()][2];

    for (int i = 0; i < arrays.size(); i++) {
      arr[i] = new int[]{arrays.get(i).get(0), arrays.get(i).get(arrays.get(i).size() - 1)};
    }

    int[] min1 = new int[]{-1, -1};
    int[] min2 = new int[]{-1, -1};
    int[] max1 = new int[]{-1, -1};
    int[] max2 = new int[]{-1, -1};

    for (int i = 0; i < arr.length; i++) {
      if (min1[1] == -1 || arr[i][0] < min1[0]) {
        min2 = min1;
        min1 = new int[]{arr[i][0], i};
      } else if (min2[1] == -1 || arr[i][0] < min2[0]) {
        min2 = new int[]{arr[i][0], i};
      }

      if (max1[1] == -1 || arr[i][1] > max1[0]) {
        max2 = max1;
        max1 = new int[]{arr[i][1], i};
      } else if (max2[1] == -1 || arr[i][1] > max2[0]) {
        max2 = new int[]{arr[i][1], i};
      }
    }

    if (min1[1] != max1[1]) {
      return max1[0] - min1[0];
    } else {
      return Math.max(max2[0] - min1[0], max1[0] - min2[0]);
    }
  }
}
