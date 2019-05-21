package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 434. Number of Segments in a String")
class NumberOfSegmentsTest {
	/* Write code here. */

  NumberOfSegments numberOfSegments = new NumberOfSegments();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(5, numberOfSegments.countSegments("Hello, my name is John"));
  }


}
