package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 873. Length of Longest Fibonacci Subsequence")
class LengthOfLongestFibonacciSubsequenceTest {

  private LengthOfLongestFibonacciSubsequence lengthOfLongestFibonacciSubsequence = new LengthOfLongestFibonacciSubsequence();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] arr = {
        1,2,3,4,5,6,7,8
    };
    Assertions.assertEquals(5, lengthOfLongestFibonacciSubsequence.lenLongestFibSubseq(arr));
  }
}
