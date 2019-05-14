package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("breadthFirstSearch")
@Tag("matrix")
@DisplayName("LeetCode: 286. Walls and Gates")
class WallsAndGatesTest {
	/* Write code here. */

  WallsAndGates wallsAndGates = new WallsAndGates();
  private int INF = wallsAndGates.INF;

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] grid = {
        {INF, -1, 0, INF},
        {INF, INF, INF, -1},
        {INF, -1, INF, -1},
        {0, -1, INF, INF}
    };
    int[][] expected = {
        {3, -1, 0, 1},
        {2, 2, 1, -1},
        {1, -1, 2, -1},
        {0, -1, 3, 4}
    };
    wallsAndGates.wallsAndGates(grid);
    Assertions.assertArrayEquals(expected, grid);
  }


}
