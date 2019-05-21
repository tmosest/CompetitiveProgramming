package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 844. Backspace String Compare")
class BackspaceStringCompareTest {
	/* Write code here. */

  BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(backspaceStringCompare.backspaceCompare("ab#c", "ad#c"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertTrue(backspaceStringCompare.backspaceCompare("ab##", "c#d#"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertTrue(backspaceStringCompare.backspaceCompare("a##c", "#a#c"));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    Assertions.assertFalse(backspaceStringCompare.backspaceCompare("a#c", "b"));
  }


}
