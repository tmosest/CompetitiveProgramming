package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 593. Valid Square")
class ValidSquareTest {

  private ValidSquare validSquare = new ValidSquare();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] points = {
        {0,0},
        {1,1},
        {1,0},
        {0,1}
    };
    Assertions.assertTrue(validSquare.validSquare(points[0], points[1], points[2], points[3]));
  }
}
