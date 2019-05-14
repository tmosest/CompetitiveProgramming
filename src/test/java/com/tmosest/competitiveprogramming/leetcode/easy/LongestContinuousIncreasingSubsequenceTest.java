package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 674. Longest Continuous Increasing Subsequence")
class LongestContinuousIncreasingSubsequenceTest {
	/* Write code here. */

  LongestContinuousIncreasingSubsequence longestContinuousIncreasingSubsequence = new LongestContinuousIncreasingSubsequence();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {1,3,5,4,7};
    Assertions.assertEquals(3, longestContinuousIncreasingSubsequence.findLengthOfLcis(input));
  }


}
