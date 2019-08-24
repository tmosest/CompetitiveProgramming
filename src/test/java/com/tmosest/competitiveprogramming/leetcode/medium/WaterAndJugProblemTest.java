package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 365. Water and Jug Problem")
class WaterAndJugProblemTest {

  private WaterAndJugProblem waterAndJugProblem = new WaterAndJugProblem();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(waterAndJugProblem.canMeasureWater(3, 5, 4));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(waterAndJugProblem.canMeasureWater(2, 6, 5));
  }
}
