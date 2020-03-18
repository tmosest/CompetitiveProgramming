package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 494. Target Sum")
class TargetSumTest {

  private TargetSum targetSum = new TargetSum();

  @Test
  void testCase0() {
    int[] nums = {1, 1, 1, 1, 1};
    Assertions.assertEquals(5, targetSum.findTargetSumWays(nums, 3));
  }
}
