package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@DisplayName("LeetCode: 678. Valid Parenthesis String")
public class ValidParenthesisStringTest {

  ValidParenthesisString validParenthesisString = new ValidParenthesisString();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(validParenthesisString.checkValidString("()"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertTrue(validParenthesisString.checkValidString("(*)"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertTrue(validParenthesisString.checkValidString("(*))"));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    Assertions.assertFalse(validParenthesisString.checkValidString(")(*))"));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    Assertions.assertTrue(validParenthesisString.checkValidString("(*()"));
  }

  /*
  @Test
  @DisplayName("Test Case 5")
  void testCase5() {
    Assertions.assertTrue(validParenthesisString.checkValidString("((*)"));
  }
  */
}
