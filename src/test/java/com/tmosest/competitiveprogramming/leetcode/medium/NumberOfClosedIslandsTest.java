package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("depthFirstSearch")
@DisplayName("LeetCode: 1254. Number of Closed Islands")
class NumberOfClosedIslandsTest {

  private NumberOfClosedIslands numberOfClosedIslands =
      new NumberOfClosedIslands();

  @Test
  void testCase0() {
    Assertions.assertEquals(2,
        numberOfClosedIslands.closedIsland(
            new int[][]
                {{1, 1, 1, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1, 1, 0}, {1, 0, 1, 0, 1, 1, 1, 0},
                    {1, 0, 0, 0, 0, 1, 0, 1}, {1, 1, 1, 1, 1, 1, 1, 0}}
        ));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(1,
        numberOfClosedIslands.closedIsland(
            new int[][]
                {{0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 1, 1, 1, 0}}
        ));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(2,
        numberOfClosedIslands.closedIsland(
            new int[][]{
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}}
        ));
  }
}
