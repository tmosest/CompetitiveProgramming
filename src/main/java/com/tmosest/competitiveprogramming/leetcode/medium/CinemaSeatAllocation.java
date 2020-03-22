package com.tmosest.competitiveprogramming.leetcode.medium;


import com.tmosest.competitiveprogramming.leetcode.common.Interval;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class CinemaSeatAllocation {

  int maxNumberOfFamilies(int rows, int[][] reservedSeats) {
    Map<Integer, List<Interval>> intervalMap = Interval.levelsFromMatrix(reservedSeats);
    int fams = 0;

    for (int r = 0; r < rows; r++) {

      boolean[] reserved = new boolean[10];

      for (Interval i : intervalMap.getOrDefault(r + 1, new ArrayList<>())) {
        reserved[i.end - 1] = true;
      }

      if (!reserved[1] && !reserved[2] && !reserved[3] && !reserved[4]) {
        ++fams;
        reserved[1] = true;
        reserved[2] = true;
        reserved[3] = true;
        reserved[2] = true;
      }

      if (!reserved[3] && !reserved[4] && !reserved[5] && !reserved[6]) {
        ++fams;
        reserved[3] = true;
        reserved[4] = true;
        reserved[5] = true;
        reserved[6] = true;
      }

      if (!reserved[5] && !reserved[6] && !reserved[7] && !reserved[8]) {
        ++fams;
        reserved[5] = true;
        reserved[6] = true;
        reserved[7] = true;
        reserved[8] = true;
      }
    }

    return fams;
  }
}
