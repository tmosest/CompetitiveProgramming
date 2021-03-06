package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 647. Palindromic Substrings")
class PalindromicSubstringsTest {

  private PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(3, palindromicSubstrings.countSubstrings("abc"));
  }
}
