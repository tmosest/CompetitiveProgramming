package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("string")
@Tag("medium")
@DisplayName("LeetCode: 681. Next Closest Time")
class NextClosestTimeTest {
	/* Write code here. */

  NextClosestTime nextClosestTime = new NextClosestTime();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("19:39", nextClosestTime.nextClosestTime("19:34"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("22:22", nextClosestTime.nextClosestTime("23:59"));
  }


}
