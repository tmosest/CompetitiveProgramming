package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("dynamic")
@DisplayName("LeetCode: 256. Paint House")
class PaintHouseTest {
	/* Write code here. */

  PaintHouse paintHouse = new PaintHouse();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] costs = {
        {17,2,17},
        {16,16,5},
        {14,3,19}
    };
    Assertions.assertEquals(10, paintHouse.minCost(costs));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[][] costs = {};
    Assertions.assertEquals(0, paintHouse.minCost(costs));
  }


}
