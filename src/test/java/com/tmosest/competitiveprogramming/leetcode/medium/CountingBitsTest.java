package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 338. Counting Bits")
class CountingBitsTest {

  private CountingBits countingBits = new CountingBits();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] expected = {
        0, 1, 1
    };
    Assertions.assertArrayEquals(expected, countingBits.countBits(2));
  }
}
