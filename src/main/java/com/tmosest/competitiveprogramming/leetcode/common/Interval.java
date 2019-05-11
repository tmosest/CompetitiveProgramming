package com.tmosest.competitiveprogramming.leetcode.common;

public class Interval {
  public int start;
  public int end;

  public Interval() {
    start = 0;
    end = 0;
  }

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Interval) {
      Interval other = (Interval) obj;
      return this.start == other.start && this.end == other.end;
    }
    return false;
  }
}
