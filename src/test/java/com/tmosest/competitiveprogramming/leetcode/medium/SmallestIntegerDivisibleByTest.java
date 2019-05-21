package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("number")
@Tag("medium")
@DisplayName("LeetCode: 1022. Smallest Integer Divisible by K")
class SmallestIntegerDivisibleByTest {
	/* Write code here. */

  SmallestIntegerDivisibleBy smallestIntegerDivisibleBy = new SmallestIntegerDivisibleBy();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(1, smallestIntegerDivisibleBy.smallestRepunitDivByK(1));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals(-1, smallestIntegerDivisibleBy.smallestRepunitDivByK(2));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals(3, smallestIntegerDivisibleBy.smallestRepunitDivByK(3));
  }


}
