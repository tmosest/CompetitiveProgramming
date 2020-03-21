package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("interval")
@Tag("medium")
@DisplayName("LeetCode: 729. My Calendar I")
class MyCalendarOneTest {


  @Test
  void testCase0() {
    MyCalendarOne myCalendarOne = new MyCalendarOne();
    Assertions.assertTrue(myCalendarOne.book(10, 20));
    Assertions.assertFalse(myCalendarOne.book(15, 25));
    Assertions.assertTrue(myCalendarOne.book(20, 30));
  }
}
