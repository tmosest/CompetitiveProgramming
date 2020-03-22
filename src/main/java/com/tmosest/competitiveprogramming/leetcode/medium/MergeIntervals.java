package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MergeIntervals {

  /**
   * Function to merge intervals if needed.
   *
   * @param intervals List of intervals.
   * @return Merged list of intervals.
   */
  List<Interval> merge(List<Interval> intervals) {
    List<Interval> result = new ArrayList<>();
    if (intervals == null || intervals.size() == 0) {
      return result;
    }
    Collections.sort(intervals);
    Interval prev = intervals.get(0);
    for (int i = 1; i < intervals.size(); i++) {
      Interval current = intervals.get(i);
      if (current.overlapsClosedClosed(prev)) {
        prev = current.merge(prev);
      } else {
        result.add(prev);
        prev = current;
      }
    }
    result.add(prev);
    return result;
  }
}
