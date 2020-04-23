package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 1403. Minimum Subsequence in Non-Increasing Order")
class MinimumSubsequenceInNonincreasingOrderTest {

  private MinimumSubsequenceInNonincreasingOrder minimumSubsequenceInNonincreasingOrder =
      new MinimumSubsequenceInNonincreasingOrder();

  @Test
  void testCase0() {
    Assertions.assertEquals(2, minimumSubsequenceInNonincreasingOrder.minSubsequence(new int[]{
        4, 3, 10, 9, 8
    }).size());
  }
}
