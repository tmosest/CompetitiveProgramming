package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@DisplayName("LeetCode: 693. Binary Number with Alternating Bits")
class BinaryNumberWithAlternatingBitsTest {
	/* Write code here. */

  BinaryNumberWithAlternatingBits binaryNumberWithAlternatingBits = new BinaryNumberWithAlternatingBits();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(binaryNumberWithAlternatingBits.hasAlternatingBits(5));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(binaryNumberWithAlternatingBits.hasAlternatingBits(11));
  }


}
