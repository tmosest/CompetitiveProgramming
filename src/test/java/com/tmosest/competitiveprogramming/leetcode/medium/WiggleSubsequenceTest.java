package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 376. Wiggle Subsequence")
class WiggleSubsequenceTest {

  private WiggleSubsequence wiggleSubsequence = new WiggleSubsequence();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,7,4,9,2,5
    };
    Assertions.assertEquals(6, wiggleSubsequence.wiggleMaxLength(input));
  }
}
