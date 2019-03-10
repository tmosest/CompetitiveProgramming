package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@DisplayName("LeetCode: 994. Rotting Oranges")
public class RottingOrangesTest {

  RottingOranges rottingOranges = new RottingOranges();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {{2,1,1},{1,1,0},{0,1,1}};
    Assertions.assertEquals(4, rottingOranges.orangesRotting(input));
  }
}
