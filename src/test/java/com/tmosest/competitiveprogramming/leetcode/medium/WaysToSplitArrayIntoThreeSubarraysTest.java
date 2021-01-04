package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc222")
@DisplayName("LeetCode: 1712. Ways to Split Array Into Three Subarrays")
class WaysToSplitArrayIntoThreeSubarraysTest {

  private WaysToSplitArrayIntoThreeSubarrays waysToSplitArrayIntoThreeSubarrays;

  @BeforeEach
  void setup() {
    waysToSplitArrayIntoThreeSubarrays = new WaysToSplitArrayIntoThreeSubarrays();
  }

  private void test(int output, int[] nums) {
    Assertions.assertEquals(output, waysToSplitArrayIntoThreeSubarrays.waysToSplit(nums));
  }

  @Test
  void test0() {
    test(3, new int[]{1, 2, 2, 2, 5, 0});
  }
}
