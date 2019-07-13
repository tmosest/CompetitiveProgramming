package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 926. Flip String to Monotone Increasing")
class FlipStringToMonotoneIncreasingTest {

  private FlipStringToMonotoneIncreasing flipStringToMonotoneIncreasing = new FlipStringToMonotoneIncreasing();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(1, flipStringToMonotoneIncreasing.minFlipsMonoIncr("00110"));
  }
}
