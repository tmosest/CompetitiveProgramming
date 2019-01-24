package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("number")
@DisplayName("LeetCode: 720. Longest Word in Dictionary")
public class RotatedDigitsTest {

  RotatedDigits rotatedDigits = new RotatedDigits();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(4, rotatedDigits.rotatedDigits(10));
  }
}
