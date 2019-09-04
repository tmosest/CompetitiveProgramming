package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 396. Rotate Function")
class RotateFunctionTest {

  private RotateFunction rotateFunction = new RotateFunction();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        4, 3, 2, 6
    };
    Assertions.assertEquals(26, rotateFunction.maxRotateFunction(input));
  }

}
