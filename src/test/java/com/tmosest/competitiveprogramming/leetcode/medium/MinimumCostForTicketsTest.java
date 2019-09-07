package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 983. Minimum Cost For Tickets")
class MinimumCostForTicketsTest {

  private MinimumCostForTickets minimumCostForTickets = new MinimumCostForTickets();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] days = {
        1,4,6,7,8,20
    };
    int[] costs = {
        2,7,15
    };
    Assertions.assertEquals(11, minimumCostForTickets.mincostTickets(days, costs));
  }
}
