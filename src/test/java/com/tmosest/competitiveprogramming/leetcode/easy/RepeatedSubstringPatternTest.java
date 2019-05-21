package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 459. Repeated Substring Pattern")
class RepeatedSubstringPatternTest {
	/* Write code here. */

  RepeatedSubstringPattern repeatedSubstringPattern = new RepeatedSubstringPattern();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(repeatedSubstringPattern.repeatedSubstringPattern("abab"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(repeatedSubstringPattern.repeatedSubstringPattern("aba"));
  }


}
