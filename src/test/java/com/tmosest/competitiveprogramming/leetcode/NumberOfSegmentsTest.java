package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 434. Number of Segments in a String")
public class NumberOfSegmentsTest {

  NumberOfSegments numberOfSegments = new NumberOfSegments();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(5, numberOfSegments.countSegments("Hello, my name is John"));
  }
}
