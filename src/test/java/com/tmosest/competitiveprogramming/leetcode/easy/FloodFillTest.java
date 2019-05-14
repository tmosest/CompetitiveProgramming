package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("depthFirstSearch")
@DisplayName("LeetCode: 733. Flood Fill")
class FloodFillTest {
	/* Write code here. */

  FloodFill floodFill = new FloodFill();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] expected = {
        {2,2,2},
        {2,2,0},
        {2,0,1}
    };
    int[][] input = {
        {1,1,1},
        {1,1,0},
        {1,0,1}
    };
    Assertions.assertArrayEquals(expected, floodFill.floodFill(input, 1, 1, 2));
  }


}
