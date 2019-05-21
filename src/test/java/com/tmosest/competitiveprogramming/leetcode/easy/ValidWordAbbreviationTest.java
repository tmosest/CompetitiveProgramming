package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@DisplayName("LeetCode: 408. Valid Word Abbreviation")
class ValidWordAbbreviationTest {
	/* Write code here. */

  ValidWordAbbreviation validWordAbbreviation = new ValidWordAbbreviation();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(validWordAbbreviation.validWordAbbreviation("internationalization", "i12iz4n"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(validWordAbbreviation.validWordAbbreviation("apple", "a2e"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertTrue(validWordAbbreviation.validWordAbbreviation("internationalization", "i5a11o1"));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    Assertions.assertFalse(validWordAbbreviation.validWordAbbreviation("h1", "11"));
  }


}
