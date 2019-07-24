package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 939. Minimum Area Rectangle")
class MinimumAreaRectangleTest {

  private MinimumAreaRectangle minimumAreaRectangle = new MinimumAreaRectangle();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] points = 
        {{1,1},{1,3},{3,1},{3,3},{2,2}};
    Assertions.assertEquals(4, minimumAreaRectangle.minAreaRect(points));
  }
}
