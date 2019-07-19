package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 456. 132 Pattern")
class OneHundredThirtyTwoPatternTest {

  private OneHundredThirtyTwoPattern oneHundredThirtyTwoPattern = new OneHundredThirtyTwoPattern();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1, 2, 3, 4
    };
    Assertions.assertFalse(oneHundredThirtyTwoPattern.find132pattern(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        3, 1, 4, 2
    };
    Assertions.assertTrue(oneHundredThirtyTwoPattern.find132pattern(input));
  }
}
