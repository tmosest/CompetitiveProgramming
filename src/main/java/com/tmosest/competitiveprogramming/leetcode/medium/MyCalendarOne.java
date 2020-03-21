package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.Interval;

import java.util.ArrayList;
import java.util.List;

class MyCalendarOne {

  private List<Interval> intervals;

  MyCalendarOne() {
    intervals = new ArrayList<>();
  }

  boolean book(int start, int end) {
    Interval next = new Interval(start, end);
    for (Interval i : intervals) {
      if (next.overlaps(i)) {
        return false;
      }
    }

    intervals.add(next);
    return true;
  }
}
