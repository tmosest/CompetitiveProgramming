package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("palindrome")
@DisplayName("LeetCode: 409. Longest Palindrome")
public class LongestPalindromeTest {

  LongestPalindrome longestPalindrome = new LongestPalindrome();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(7, longestPalindrome.longestPalindrome("abccccdd"));
  }
}
