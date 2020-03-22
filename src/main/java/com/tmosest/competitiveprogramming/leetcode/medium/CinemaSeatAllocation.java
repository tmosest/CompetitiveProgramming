package com.tmosest.competitiveprogramming.leetcode.medium;


import com.tmosest.competitiveprogramming.leetcode.common.Interval;
import java.util.Collections;
import java.util.List;

class CinemaSeatAllocation {

  int maxNumberOfFamilies(int rows, int[][] reservedSeats) {
    List<Interval> intervals = Interval.fromMatrix(reservedSeats);
    Collections.sort(intervals);
    int fams = 0;
    int intervalIndex = 0;

    for (int r = 0; r < rows; r++) {

      boolean[] reserved = new boolean[10];

      while (intervalIndex < intervals.size() && intervals.get(intervalIndex).start == r + 1) {
        reserved[intervals.get(intervalIndex).end - 1] = true;
        ++intervalIndex;
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
