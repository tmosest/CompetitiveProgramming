package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 963. Minimum Area Rectangle II")
class MinimumAreaRectangleTwoTest {

  private MinimumAreaRectangleTwo minimumAreaRectangleTwo = new MinimumAreaRectangleTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] points =
        {{1, 2}, {2, 1}, {1, 0}, {0, 1}};
    Assertions.assertNotEquals(0.0, minimumAreaRectangleTwo.minAreaFreeRect(points));
  }
}
