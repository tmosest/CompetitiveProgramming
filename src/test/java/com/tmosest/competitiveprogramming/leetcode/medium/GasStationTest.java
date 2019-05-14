package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("greedy")
@DisplayName("LeetCode: 134. Gas Station")
class GasStationTest {
	/* Write code here. */

  private GasStation gasStation = new GasStation();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] gas = {
        1,2,3,4,5
    };
    int[] cost = {
        3,4,5,1,2
    };
    Assertions.assertEquals(3, gasStation.canCompleteCircuit(gas, cost));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] gas = {
        2,3,4
    };
    int[] cost = {
        3,4,3
    };
    Assertions.assertEquals(-1, gasStation.canCompleteCircuit(gas, cost));
  }


}
