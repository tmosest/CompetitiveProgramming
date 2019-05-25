package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 29. Divide Two Integers")
class DivideTwoIntegersTest {

  private DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(3, divideTwoIntegers.divide(6, 2));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals(1, divideTwoIntegers.divide(2, 2));
  }
}
