package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("string")
@Tag("regex")
@DisplayName("LeetCode: 10. Regular Expression Matching")
public class RegularExpressionMatchingTest {

  RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertFalse(regularExpressionMatching.isMatch("aa", "a"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertTrue(regularExpressionMatching.isMatch("aa", "a*"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertTrue(regularExpressionMatching.isMatch("ab", ".*"));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    Assertions.assertTrue(regularExpressionMatching.isMatch("aab", "c*a*b"));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    Assertions.assertFalse(regularExpressionMatching.isMatch("mississippi", "mis*is*p*."));
  }
}
