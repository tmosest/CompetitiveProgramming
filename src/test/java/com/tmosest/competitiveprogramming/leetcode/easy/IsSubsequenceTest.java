package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 392. Is Subsequence")
class IsSubsequenceTest {

  private IsSubsequence isSubsequence = new IsSubsequence();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(isSubsequence.isSubsequence("abc", "ahbgdc"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(isSubsequence.isSubsequence("axc", "ahbgdc"));
  }
}
