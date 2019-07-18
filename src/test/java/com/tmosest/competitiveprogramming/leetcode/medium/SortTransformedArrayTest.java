package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 360. Sort Transformed Array")
class SortTransformedArrayTest {

  private SortTransformedArray sortTransformedArray = new SortTransformedArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        -4,-2,2,4
    };
    int[] expected = {
        3,9,15,33
    };
    Assertions.assertArrayEquals(expected, sortTransformedArray.sortTransformedArray(input, 1, 3, 5));
  }
}
