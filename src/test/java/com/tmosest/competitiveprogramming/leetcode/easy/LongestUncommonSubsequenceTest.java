package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 521. Longest Uncommon Subsequence I")
class LongestUncommonSubsequenceTest {
	/* Write code here. */

  LongestUncommonSubsequence longestUncommonSubsequence = new LongestUncommonSubsequence();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(3, longestUncommonSubsequence.findLUsLength("aba", "cdc"));
  }


}
