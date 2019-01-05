package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

  private class IntervalComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval one, Interval two) {
      return Integer.compare(one.start, two.start);
    }
  }

  private boolean areOverlappingIntervals(Interval one, Interval two) {
    if (two.start <= one.end && one.start <= two.start) {
      return true;
    }
    if (two.end <= one.end && one.start <= two.end) {
      return true;
    }
    if (one.start <= two.end && two.start <= one.start) {
      return true;
    }
    if (one.end <= two.end && two.start <= one.end) {
      return true;
    }
    if (one.start <= two.start && one.end >= two.end) {
      return true;
    }
    if (two.start <= one.start && two.end >= one.end) {
      return true;
    }
    return false;
  }

  /**
   * Function to merge intervals if needed.
   * @param intervals List of intervals.
   * @return Merged list of intervals.
   */
  public List<Interval> merge(List<Interval> intervals) {
    List<Interval> result = new ArrayList<>();
    if (intervals == null || intervals.size() == 0) {
      return result;
    }
    Collections.sort(intervals, new IntervalComparator());
    Interval prev = intervals.get(0);
    for (int i = 1; i < intervals.size(); i++) {
      Interval current = intervals.get(i);
      if (areOverlappingIntervals(current, prev)) {
        prev = new Interval(
            Math.min(prev.start, current.start),
            Math.max(prev.end, current.end)
        );
      } else {
        result.add(prev);
        prev = current;
      }
    }
    result.add(prev);
    return result;
  }
}
