package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("wc176")
@DisplayName("LeetCode: 1353. Maximum Number of Events That Can Be Attended")
class MaximumNumberOfEventsThatCanBeAttendedTest {

  private MaximumNumberOfEventsThatCanBeAttended maximumNumberOfEventsThatCanBeAttended =
      new MaximumNumberOfEventsThatCanBeAttended();

  @Test
  void testCase0() {
    Assertions.assertEquals(3, maximumNumberOfEventsThatCanBeAttended.maxEvents(
        new int[][] {{1,2}, {2,3}, {3,4}}
    ));
  }
}
