package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("number")
@DisplayName("LeetCode: 869. Reordered Power of 2")
class ReorderedPowerOfTwoTest {

  ReorderedPowerOfTwo reorderedPowerOfTwo = new ReorderedPowerOfTwo();

  @Test
  @DisplayName("1 can be rearranged to a power of two")
  void testCase0() {
    Assertions.assertTrue(reorderedPowerOfTwo.reorderedPowerOf2(1));
  }

  @Test
  @DisplayName("10 can't be rearranged into a power of two")
  void testCase1() {
    Assertions.assertFalse(reorderedPowerOfTwo.reorderedPowerOf2(10));
  }

  @Test
  @DisplayName("16 can be rearranged to a power of two")
  void testCase2() {
    Assertions.assertTrue(reorderedPowerOfTwo.reorderedPowerOf2(16));
  }

  @Test
  @DisplayName("24 can't be rearranged into a power of two")
  void testCase3() {
    Assertions.assertFalse(reorderedPowerOfTwo.reorderedPowerOf2(24));
  }

  @Test
  @DisplayName("46 can be rearranged to a power of two")
  void testCase4() {
    Assertions.assertTrue(reorderedPowerOfTwo.reorderedPowerOf2(46));
  }
}
