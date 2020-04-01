package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("wc177")
@DisplayName("LeetCode: 1360. Number of Days Between Two Dates")
class NumberOfDaysBetweenTwoDatesTest {

  private NumberOfDaysBetweenTwoDates numberOfDaysBetweenTwoDates =
      new NumberOfDaysBetweenTwoDates();

  @Test
  void testCase0() {
    Assertions.assertEquals(1, numberOfDaysBetweenTwoDates.daysBetweenDates("2019-06-29", "2019-06-30"));
  }
}
