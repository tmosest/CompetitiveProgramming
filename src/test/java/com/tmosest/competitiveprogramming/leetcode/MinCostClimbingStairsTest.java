package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("dynamic")
@DisplayName("LeetCode: 746. Min Cost Climbing Stairs")
public class MinCostClimbingStairsTest {

  MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] costs = { 10, 15, 20 };
    Assertions.assertEquals(15, minCostClimbingStairs.minCostClimbingStairs(costs));
  }
}
