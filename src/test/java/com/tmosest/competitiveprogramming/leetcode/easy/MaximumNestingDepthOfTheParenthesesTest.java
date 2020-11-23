package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc210")
@DisplayName("LeetCode: 1614. Maximum Nesting Depth of the Parentheses")
class MaximumNestingDepthOfTheParenthesesTest {

  private MaximumNestingDepthOfTheParentheses maximumNestingDepthOfTheParentheses =
      new MaximumNestingDepthOfTheParentheses();

  private void test(int expected, String input) {
    Assertions.assertEquals(expected, maximumNestingDepthOfTheParentheses.maxDepth(input));
  }

  @Test
  void test1() {
    test(3, "(1+(2*3)+((8)/4))+1");
  }

  @Test
  void test2() {
    test(3, "(1)+((2))+(((3)))");
  }
}
