package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc193")
@DisplayName("LeetCode: 1481. Least Number of Unique Integers after K Removals")
class LeastNumberOfUniqueIntegersAfterRemovalsTest {

  private LeastNumberOfUniqueIntegersAfterRemovals leastNumberOfUniqueIntegersAfterRemovals =
      new LeastNumberOfUniqueIntegersAfterRemovals();

  private void test(int[] input, int removals, int output) {
    Assertions.assertEquals(output, leastNumberOfUniqueIntegersAfterRemovals.findLeastNumOfUniqueInts(input, removals));
  }

  @Test
  void testCase0() {
    test(new int[] {5,5,4}, 1, 1);
  }

  @Test
  void testCase1() {
    test(new int[] {4,3,1,1,3,3,2}, 3, 2);
  }
}
