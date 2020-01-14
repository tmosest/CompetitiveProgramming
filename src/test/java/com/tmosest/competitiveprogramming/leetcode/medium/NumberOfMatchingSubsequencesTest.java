package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 792. Number of Matching Subsequences")
class NumberOfMatchingSubsequencesTest {

  @Test
  void numMatchingSubseq_testCase0_returns3() {
    String[] words = {"a", "bb", "acd", "ace"};
    Assertions
        .assertEquals(3, new NumberOfMatchingSubsequences().numMatchingSubseq("abcde", words));
  }
}
