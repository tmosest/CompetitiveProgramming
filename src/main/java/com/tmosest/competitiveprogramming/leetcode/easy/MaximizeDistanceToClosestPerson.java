package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class MaximizeDistanceToClosestPerson {
  /* Write code here. */

  /**
   * Function to find the max distance between two people after choosing a seat.
   *
   * @param seats An array of integers 1 if seat taken and 0 otherwise.
   * @return The max distance after optimally choosing a seat.
   */
  public int maxDistToClosest(int[] seats) {
    int length = seats.length;
    int[] left = new int[length];
    int[] right = new int[length];
    Arrays.fill(left, length);
    Arrays.fill(right, length);

    for (int i = 0; i < length; ++i) {
      if (seats[i] == 1) {
        left[i] = 0;
      } else if (i > 0) {
        left[i] = left[i - 1] + 1;
      }
    }

    for (int i = length - 1; i >= 0; --i) {
      if (seats[i] == 1) {
        right[i] = 0;
      } else if (i < length - 1) {
        right[i] = right[i + 1] + 1;
      }
    }

    int ans = 0;
    for (int i = 0; i < length; ++i) {
      if (seats[i] == 0) {
        ans = Math.max(ans, Math.min(left[i], right[i]));
      }
    }
    return ans;
  }


}
