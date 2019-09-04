package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 416. Partition Equal Subset Sum")
class PartitionEqualSubsetSumTest {

  private PartitionEqualSubsetSum partitionEqualSubsetSum = new PartitionEqualSubsetSum();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] inputs = {
        1, 5, 11, 5
    };
    Assertions.assertTrue(partitionEqualSubsetSum.canPartition(inputs));
  }
}
