package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 223. Rectangle Area")
class RectangleAreaTest {

  private RectangleArea rectangleArea = new RectangleArea();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(45, rectangleArea.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
  }
}
