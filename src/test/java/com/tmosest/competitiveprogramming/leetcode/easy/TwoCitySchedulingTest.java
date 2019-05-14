package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@DisplayName("LeetCode: 1029. Two City Scheduling")
class TwoCitySchedulingTest {
	/* Write code here. */

  private TwoCityScheduling twoCityScheduling = new TwoCityScheduling();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
    Assertions.assertEquals(110, twoCityScheduling.twoCitySchedCost(costs));
  }


}
