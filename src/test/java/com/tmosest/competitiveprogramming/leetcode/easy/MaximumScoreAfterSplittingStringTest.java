package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc186")
@DisplayName("LeetCode: 1422. Maximum Score After Splitting a String")
class MaximumScoreAfterSplittingStringTest {

  private MaximumScoreAfterSplittingString maximumScoreAfterSplittingString =
      new MaximumScoreAfterSplittingString();

  @Test
  void testCase0() {
    Assertions.assertEquals(5, maximumScoreAfterSplittingString.maxScore("011101"));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(5, maximumScoreAfterSplittingString.maxScore("00111"));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(3, maximumScoreAfterSplittingString.maxScore("1111"));
  }
}
