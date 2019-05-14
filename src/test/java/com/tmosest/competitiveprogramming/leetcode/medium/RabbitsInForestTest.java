package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 781. Rabbits in Forest")
class RabbitsInForestTest {
	/* Write code here. */

  private RabbitsInForest rabbitsInForest = new RabbitsInForest();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1, 1, 2
    };
    Assertions.assertEquals(5, rabbitsInForest.numRabbits(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        10, 10, 10
    };
    Assertions.assertEquals(11, rabbitsInForest.numRabbits(input));
  }


}
