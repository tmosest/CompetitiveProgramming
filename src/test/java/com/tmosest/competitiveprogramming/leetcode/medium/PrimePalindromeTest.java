package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 866. Prime Palindrome")
class PrimePalindromeTest {

  private PrimePalindrome primePalindrome = new PrimePalindrome();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(7, primePalindrome.primePalindrome(6));
  }
}
