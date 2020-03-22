package com.tmosest.competitiveprogramming.leetcode.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Interval implements Comparable<Interval> {

  public final int start;
  public final int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public Interval(int[] arr) {
    this.start = arr[0];
    this.end = arr[1];
  }

  public static List<Interval> fromMatrix(int[][] matrix) {
    return Arrays.stream(matrix).map(Interval::new).collect(Collectors.toList());
  }

  /**
   * Create levels from matrix.
   * @param matrix Matrix of intervals.
   * @return Map of start to list of intervals for that start interval.
   */
  public static Map<Integer, List<Interval>> levelsFromMatrix(int[][] matrix) {
    List<Interval> intervals = fromMatrix(matrix);
    Map<Integer, List<Interval>> levels = new HashMap<>();
    for (Interval i : intervals) {
      List<Interval> level = levels.getOrDefault(i.start, new ArrayList<>());
      level.add(i);
      levels.put(i.start, level);
    }
    return levels;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Interval) {
      Interval other = (Interval) obj;
      return this.start == other.start && this.end == other.end;
    }
    return false;
  }

  @Override
  public int compareTo(Interval other) {
    int start = Integer.compare(this.start, other.start);
    if (start != 0) {
      return start;
    }
    return Integer.compare(this.end, other.end);
  }

  /**
   * Checks for overlap in an closed-open interval [a,b);
   *
   * @param other the other interval to compare to.
   * @return True if they overlap.
   */
  public boolean overlapsClosedOpen(Interval other) {
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

  /**
   * Checks for overlap in an closed-open interval [a,b);
   *
   * @param other the other interval to compare to.
   * @return True if they overlap.
   */
  public boolean overlapsClosedClosed(Interval other) {
    if (other.start <= this.end && this.start <= other.start) {
      return true;
    }
    if (other.end <= this.end && this.start <= other.end) {
      return true;
    }
    if (this.start <= other.end && other.start <= this.start) {
      return true;
    }
    if (this.end <= other.end && other.start <= this.end) {
      return true;
    }
    if (this.start <= other.start && this.end >= other.end) {
      return true;
    }
    if (other.start <= this.start && other.end >= this.end) {
      return true;
    }
    return false;
  }

  /**
   * Assumes we are given two overlapping intervals.
   *
   * @param other The other interval.
   * @return The new interval.
   */
  public Interval merge(Interval other) {
    return new Interval(
        Math.min(this.start, other.start),
        Math.max(this.end, other.end)
    );
  }
}
