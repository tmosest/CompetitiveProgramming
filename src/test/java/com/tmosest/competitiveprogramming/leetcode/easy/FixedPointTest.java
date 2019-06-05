package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 1064. Fixed Point")
class FixedPointTest {

  private FixedPoint fixedPoint = new FixedPoint();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] inputs = {
        0, 2, 5, 8, 17
    };
    Assertions.assertEquals(0, fixedPoint.fixedPoint(inputs));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] inputs = {
        -10, -5, 3, 4, 7, 9
    };
    Assertions.assertEquals(-1, fixedPoint.fixedPoint(inputs));
  }
}
