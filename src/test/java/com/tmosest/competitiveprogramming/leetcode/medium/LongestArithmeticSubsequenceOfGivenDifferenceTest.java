package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1218. Longest Arithmetic Subsequence of Given Difference")
class LongestArithmeticSubsequenceOfGivenDifferenceTest {

  private LongestArithmeticSubsequenceOfGivenDifference longestArithmeticSubsequenceOfGivenDifference =
      new LongestArithmeticSubsequenceOfGivenDifference();

  @Test
  void testCase0() {
    int[] arr = {1,2,3,4};
    Assertions.assertEquals(4, longestArithmeticSubsequenceOfGivenDifference.longestSubsequence(arr, 1));
  }

  @Test
  void testCase1() {
    int[] arr = {1,3,5,7};
    Assertions.assertEquals(1, longestArithmeticSubsequenceOfGivenDifference.longestSubsequence(arr, 1));
  }

  @Test
  void testCase2() {
    int[] arr = {1,5,7,8,5,3,4,2,1};
    Assertions.assertEquals( 4, longestArithmeticSubsequenceOfGivenDifference.longestSubsequence(arr, -2));
  }
}
