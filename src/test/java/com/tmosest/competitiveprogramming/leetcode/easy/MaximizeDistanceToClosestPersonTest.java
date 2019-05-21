package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 849. Maximize Distance to Closest Person")
class MaximizeDistanceToClosestPersonTest {
	/* Write code here. */

  MaximizeDistanceToClosestPerson maximizeDistanceToClosestPerson = new MaximizeDistanceToClosestPerson();

  void test(int[] input, int expected) {
    Assertions.assertEquals(expected, maximizeDistanceToClosestPerson.maxDistToClosest(input));
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {1,0,0,0,1,0,1};
    test(input, 2);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {1,0,0,0};
    test(input, 3);
  }


}
