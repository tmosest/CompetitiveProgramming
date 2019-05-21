package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("number")
@DisplayName("LeetCode: 50. Pow(x, n")
class PowTest {
	/* Write code here. */

  Pow pow = new Pow();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(1024.00000, pow.myPow(2.00000, 10));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals(9.26100, pow.myPow(2.10000, 3));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals(0.25000, pow.myPow(2.00000, -2));
  }


}
