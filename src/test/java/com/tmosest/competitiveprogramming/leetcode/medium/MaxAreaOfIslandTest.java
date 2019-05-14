package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("depthFirstSearch")
@Tag("matrix")
@DisplayName("LeetCode: 443. String Compression")
class MaxAreaOfIslandTest {
	/* Write code here. */

  MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] grid = {
          {0,0,1,0,0,0,0,1,0,0,0,0,0},
          {0,0,0,0,0,0,0,1,1,1,0,0,0},
          {0,1,1,0,1,0,0,0,0,0,0,0,0},
          {0,1,0,0,1,1,0,0,1,0,1,0,0},
          {0,1,0,0,1,1,0,0,1,1,1,0,0},
          {0,0,0,0,0,0,0,0,0,0,1,0,0},
          {0,0,0,0,0,0,0,1,1,1,0,0,0},
          {0,0,0,0,0,0,0,1,1,0,0,0,0}
    };
    Assertions.assertEquals(6, maxAreaOfIsland.maxAreaOfIsland(grid));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[][] grid = {
        {0,0,0,0,0,0,0,0}
    };
    Assertions.assertEquals(0, maxAreaOfIsland.maxAreaOfIsland(grid));
  }


}
