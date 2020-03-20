package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 907. Sum of Subarray Minimums")
class SumOfSubarrayMinimumsTest {

  private SumOfSubarrayMinimums sumOfSubarrayMinimums = new SumOfSubarrayMinimums();

  @Test
  void testCase0() {
    int[] input = {3,1,2,4};
    Assertions.assertEquals(17, sumOfSubarrayMinimums.sumSubarrayMins(input));
  }
}
