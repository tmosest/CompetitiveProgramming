package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1154. Day of the Year")
class DayOfTheYearTest {

  private DayOfTheYear dayOfTheYear = new DayOfTheYear();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(9, dayOfTheYear.dayOfYear("2019-01-09"));
  }
}
