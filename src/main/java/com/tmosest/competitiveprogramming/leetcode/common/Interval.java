package com.tmosest.competitiveprogramming.leetcode.common;

public class Interval {

  public int start;
  public int end;

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

  /**
   * Checks for overlap in an open-closed interval [a,b);
   *
   * @param other the other interval to compare to.
   * @return True if they overlap.
   */
  public boolean overlaps(Interval other) {
    if (other.start <= this.start && this.start < other.end) {
      return true;
    }

    if (other.start < this.end && this.end < other.end) {
      return true;
    }

    if (this.start <= other.start && other.start < this.end) {
      return true;
    }

    return this.start < other.end && other.end < this.end;
  }
}
