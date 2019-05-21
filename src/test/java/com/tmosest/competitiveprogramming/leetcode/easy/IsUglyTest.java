package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@DisplayName("LeetCode: 263. Ugly Number")
class IsUglyTest {
	/* Write code here. */

  IsUgly isUgly = new IsUgly();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int num = 6;
    Assertions.assertTrue(isUgly.isUgly(num));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int num = 8;
    Assertions.assertTrue(isUgly.isUgly(num));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int num = 14;
    Assertions.assertFalse(isUgly.isUgly(num));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int num = 5;
    Assertions.assertTrue(isUgly.isUgly(num));
  }


}
