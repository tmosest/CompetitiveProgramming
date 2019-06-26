package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1027. Longest Arithmetic Sequence")
class LongestArithmeticSequenceTest {

  private LongestArithmeticSequence longestArithmeticSequence = new LongestArithmeticSequence();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        3, 6, 9, 12
    };
    Assertions.assertEquals(4, longestArithmeticSequence.longestArithSeqLength(input));
  }
}
