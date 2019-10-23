package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1185. Day of the Week")
class DayOfTheWeekTest {

  private DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();

  @Test
  public void testCase0() {
    Assertions.assertEquals("Saturday", dayOfTheWeek.dayOfTheWeek(31, 8, 2019));
  }
}
