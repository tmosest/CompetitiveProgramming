package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 475. Heaters")
class HeatersTest {
	/* Write code here. */

  Heaters heaters = new Heaters();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] houses = {1,2,3};
    int[] heats = {2};
    Assertions.assertEquals(1, heaters.findRadius(houses, heats));
  }


}
