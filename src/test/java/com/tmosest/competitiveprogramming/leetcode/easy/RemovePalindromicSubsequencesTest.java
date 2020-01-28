package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1332. Remove Palindromic Subsequences")
class RemovePalindromicSubsequencesTest {

  private RemovePalindromicSubsequences removePalindromicSubsequences = new RemovePalindromicSubsequences();

  @Test
  void testCase0() {
    Assertions.assertEquals(1, removePalindromicSubsequences.removePalindromeSub("ababa"));
  }
}
