package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 807. Max Increase to Keep City Skyline")
class MaxIncreaseToKeepCitySkylineTest {

  private MaxIncreaseToKeepCitySkyline maxIncreaseToKeepCitySkyline = new MaxIncreaseToKeepCitySkyline();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] grid = 
      {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
    Assertions.assertEquals(35, maxIncreaseToKeepCitySkyline.maxIncreaseKeepingSkyline(grid));
  }
}
