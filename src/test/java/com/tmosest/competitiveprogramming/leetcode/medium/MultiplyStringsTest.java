package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@DisplayName("LeetCode: 43. Multiply Strings")
class MultiplyStringsTest {

  private MultiplyStrings multiplyStrings = new MultiplyStrings();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("222", multiplyStrings.multiply("2", "111"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("144", multiplyStrings.multiply("12", "12"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals("10000", multiplyStrings.multiply("100", "100"));
  }
}
