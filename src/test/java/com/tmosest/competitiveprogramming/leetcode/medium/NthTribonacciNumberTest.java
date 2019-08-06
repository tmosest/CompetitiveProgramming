package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1137. N-th Tribonacci Number")
class NthTribonacciNumberTest {

  private NthTribonacciNumber nthTribonacciNumber = new NthTribonacciNumber();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(4, nthTribonacciNumber.tribonacci(4));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals(1389537, nthTribonacciNumber.tribonacci(25));
  }
}
