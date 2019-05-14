package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("dynamic")
@DisplayName("LeetCode: 198. House Robber")
class HouseRobberTest {
	/* Write code here. */

  HouseRobber houseRobber = new HouseRobber();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = { 1,2,3,1 };
    Assertions.assertEquals(4, houseRobber.rob(input));
  }


}
