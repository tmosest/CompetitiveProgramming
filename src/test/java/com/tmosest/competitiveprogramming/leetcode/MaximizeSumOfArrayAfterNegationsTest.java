package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 1005. Maximize Sum Of Array After K Negations")
public class MaximizeSumOfArrayAfterNegationsTest {

  MaximizeSumOfArrayAfterNegations maximizeSumOfArrayAfterNegations = new MaximizeSumOfArrayAfterNegations();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        4,2,3
    };
    Assertions.assertEquals(5, maximizeSumOfArrayAfterNegations.largestSumAfterNegations(input, 1));
  }
}
