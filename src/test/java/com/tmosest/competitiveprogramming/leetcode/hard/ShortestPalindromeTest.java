package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@DisplayName("LeetCode: 214. Shortest Palindrome")
class ShortestPalindromeTest {

  private ShortestPalindrome shortestPalindrome = new ShortestPalindrome();

  @Test
  void testCase0() {
    Assertions.assertEquals("aba", shortestPalindrome.shortestPalindrome("aba"));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals("aaacecaaa", shortestPalindrome.shortestPalindrome("aacecaaa"));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals("dcbabcd", shortestPalindrome.shortestPalindrome("abcd"));
  }
}
