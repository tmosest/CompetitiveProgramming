package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 594. Longest Harmonious Subsequence")
class LongestHarmoniousSubsequenceTest {
	/* Write code here. */

  LongestHarmoniousSubsequence longestHarmoniousSubsequence = new LongestHarmoniousSubsequence();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,3,2,2,5,2,3,7
    };
    Assertions.assertEquals(5, longestHarmoniousSubsequence.findLongest(input));
  }


}
