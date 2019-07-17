package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1118. Number of Days in a Month")
class NumberOfDaysInMonthTest {

  private NumberOfDaysInMonth numberOfDaysInMonth = new NumberOfDaysInMonth();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(31, numberOfDaysInMonth.numberOfDays(1992, 7));
  }
}
