package com.tmosest.competitiveprogramming.leetcode.medium;

import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.List;

class NonoverlappingIntervals {

  int eraseOverlapIntervals(int[][] intervals) {
    List<Interval> list = from(intervals);
    if (list.size() <= 1) {
      return 0;
    }
    sort(list, (one, two) -> {
      return one.start - two.start;
    });

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

  class Interval {

    int start;
    int end;
  }

  private List<Interval> from(int[][] intervals) {
    List<Interval> res = new ArrayList<>();
    for (int[] interval : intervals) {
      Interval intervalTwo = new Interval();
      intervalTwo.start = interval[0];
      intervalTwo.end = interval[1];
      res.add(intervalTwo);
    }
    return res;
  }
}
