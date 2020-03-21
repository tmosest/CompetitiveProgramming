package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class MyCalendarOne {

  private static class Interval {

    private int start;
    private int end;

    private Interval(int start, int end) {
      this.start = start;
      this.end = end;
    }

    private boolean overlaps(Interval other) {
      if (other.start < this.start && this.start < other.end) {
        return true;
      }

      if (other.start < this.end && this.end < other.end) {
        return true;
      }

      if (this.start < other.start && other.start < this.end) {
        return true;
      }

      if (this.start < other.end && other.end < this.end) {
        return true;
      }

      return false;
    }
  }

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
