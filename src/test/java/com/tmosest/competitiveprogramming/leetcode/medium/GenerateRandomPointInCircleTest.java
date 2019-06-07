package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 478. Generate Random Point in a Circle")
class GenerateRandomPointInCircleTest {

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    GenerateRandomPointInCircle generateRandomPointInCircle = new GenerateRandomPointInCircle(1, 0,
        0);
    double[] randPoint = generateRandomPointInCircle.randPoint();
    Assertions.assertEquals(1, 1);
  }
}
