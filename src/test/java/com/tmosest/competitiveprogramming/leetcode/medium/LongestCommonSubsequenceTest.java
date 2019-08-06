package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1143. Longest Common Subsequence")
class LongestCommonSubsequenceTest {

  private LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(3, longestCommonSubsequence.longestCommonSubsequence("abcde", "ace"));
  }
}
