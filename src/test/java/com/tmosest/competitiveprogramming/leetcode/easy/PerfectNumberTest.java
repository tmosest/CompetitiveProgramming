package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@DisplayName("LeetCode: 507. Perfect Number")
class PerfectNumberTest {
	/* Write code here. */

  PerfectNumber perfectNumber = new PerfectNumber();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(perfectNumber.checkPerfectNumber(28));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(perfectNumber.checkPerfectNumber(1));
  }


}
