package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc215")
@DisplayName("LeetCode: 1658. Minimum Operations to Reduce X to Zero")
class MinimumOperationsToReduceTenToZeroTest {

  @Test
  void test1() {
    Assertions.assertEquals(2,
        new MinimumOperationsToReduceTenToZero().minOperations(new int[] {1, 1, 4, 2, 3}, 5));
  }
}
