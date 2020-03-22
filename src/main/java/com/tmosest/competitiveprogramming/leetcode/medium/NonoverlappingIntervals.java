package com.tmosest.competitiveprogramming.leetcode.medium;

import static java.util.Collections.sort;

import com.tmosest.competitiveprogramming.leetcode.common.Interval;

import java.util.List;

class NonoverlappingIntervals {

  int eraseOverlapIntervals(int[][] intervals) {
    List<Interval> list = Interval.fromMatrix(intervals);
    sort(list);

    if (list.size() <= 1) {
      return 0;
    }

    int res = 0;
    int start = list.get(0).start;
    int end = list.get(0).end;
    for (int i = 1; i < list.size(); i++) {

      Interval next = list.get(i);
      if (next.start == start) {
        end = Math.min(next.end, end);
        res++;
      } else {
        if (next.start >= end) {
          start = next.start;
          end = next.end;
        } else {
          if (end >= next.end) {
            end = next.end;
            start = next.start;
          }
          res++;
        }
      }
    }

    return res;
  }
}
