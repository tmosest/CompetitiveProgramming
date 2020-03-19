package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1219. Path with Maximum Gold")
class PathWithMaximumGoldTest {

  private PathWithMaximumGold pathWithMaximumGold =
      new PathWithMaximumGold();

  @Test
  void testCase0() {
    int[][] grid =
        {{0,6,0},{5,8,7},{0,9,0}};
    Assertions.assertEquals(24, pathWithMaximumGold.getMaximumGold(grid));
  }
}
