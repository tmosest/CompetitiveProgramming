package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 435. Non-overlapping Intervals")
class NonoverlappingIntervalsTest {

  private NonoverlappingIntervals nonoverlappingIntervals =
      new NonoverlappingIntervals();

  @Test
  void testCase0() {
    int[][] input = {{1,2},{2,3},{3,4},{1,3}};
    Assertions.assertEquals(1, nonoverlappingIntervals.eraseOverlapIntervals(input));
  }
}
