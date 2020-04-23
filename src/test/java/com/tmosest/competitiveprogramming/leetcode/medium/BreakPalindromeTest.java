package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@DisplayName("LeetCode: 1328. Break a Palindrome")
class BreakPalindromeTest {

  private BreakPalindrome breakPalindrome = new BreakPalindrome();

  @Test
  void testCase0() {
    Assertions.assertEquals("aaccba", breakPalindrome.breakPalindrome("abccba"));
  }
}
