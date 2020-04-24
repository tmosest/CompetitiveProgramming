package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 659. Split Array into Consecutive Subsequences")
class SplitArrayIntoConsecutiveSubsequencesTest {

  private SplitArrayIntoConsecutiveSubsequences splitArrayIntoConsecutiveSubsequences =
      new SplitArrayIntoConsecutiveSubsequences();

  @Test
  void testCase0() {
    Assertions.assertTrue(splitArrayIntoConsecutiveSubsequences.isPossible(
        new int[] {1,2,3,3,4,5}
    ));
  }
}
