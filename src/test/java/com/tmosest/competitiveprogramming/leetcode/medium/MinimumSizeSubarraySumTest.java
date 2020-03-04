package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 209. Minimum Size Subarray Sum")
class MinimumSizeSubarraySumTest {

  private MinimumSizeSubarraySum minimumSizeSubarraySum =
      new MinimumSizeSubarraySum();

  @Test
  void testCase0() {
    int[] input = {2,3,1,2,4,3};
    Assertions.assertEquals(2, minimumSizeSubarraySum.minSubArrayLen(7, input));
  }

  @Test
  void testCase1() {
    int[] input = {1,2,3,4,5};
    Assertions.assertEquals(5, minimumSizeSubarraySum.minSubArrayLen(15, input));
  }

  @Test
  void testCase2() {
    int[] input = {};
    Assertions.assertEquals(0, minimumSizeSubarraySum.minSubArrayLen(15, input));
  }
}
