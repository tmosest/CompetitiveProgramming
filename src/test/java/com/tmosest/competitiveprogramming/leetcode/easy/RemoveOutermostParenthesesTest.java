package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 1021. Remove Outermost Parentheses")
class RemoveOutermostParenthesesTest {
	/* Write code here. */

  RemoveOutermostParentheses removeOutermostParentheses = new RemoveOutermostParentheses();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("()()()", removeOutermostParentheses.removeOuterParentheses("(()())(())"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("", removeOutermostParentheses.removeOuterParentheses("()()"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals("()()()()(())", removeOutermostParentheses.removeOuterParentheses("(()())(())(()(()))"));
  }


}
