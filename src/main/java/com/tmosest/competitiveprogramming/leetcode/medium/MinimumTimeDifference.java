package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Collections;
import java.util.List;

class MinimumTimeDifference {

  /**
   * Find the minimum time difference between two points.
   *
   * @param timePoints The 24 hour times.
   * @return The min difference between any two.
   */
  int findMinDifference(List<String> timePoints) {
    Collections.sort(timePoints);
    int diff = Integer.MAX_VALUE;
    int len = timePoints.size();
    for (int i = 0; i < timePoints.size(); i++) {
      int t1 = getTime(timePoints.get(i % len));
      int t2 = getTime(timePoints.get((i + 1) % len));
      diff = Math.min(diff, Math.min(Math.abs(t1 - t2), t2 + 1440 - t1));
    }
    return diff;
  }

  private int getTime(String str) {
    return Integer.valueOf(str.substring(0, str.indexOf(":"))) * 60 + Integer
        .valueOf(str.substring(str.indexOf(":") + 1));
  }
}
