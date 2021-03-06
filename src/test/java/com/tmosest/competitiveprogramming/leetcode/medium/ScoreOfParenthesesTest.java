package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 856. Score of Parentheses")
class ScoreOfParenthesesTest {

  private ScoreOfParentheses scoreOfParentheses =
      new ScoreOfParentheses();

  @Test
  void testCase0() {
    Assertions.assertEquals(6, scoreOfParentheses.scoreOfParentheses("(()(()))"));
  }
}
