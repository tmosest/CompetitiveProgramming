package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 915. Partition Array into Disjoint Intervals")
class PartitionArrayIntoDisjointIntervalsTest {

  private PartitionArrayIntoDisjointIntervals partitionArrayIntoDisjointIntervals =
      new PartitionArrayIntoDisjointIntervals();

  @Test
  void testCase0() {
    int[] input = {5,0,3,8,6};
    Assertions.assertEquals(3, partitionArrayIntoDisjointIntervals.partitionDisjoint(input));
  }

  @Test
  void testCase1() {
    int[] input = {1,1,1,0,6,12};
    Assertions.assertEquals(4, partitionArrayIntoDisjointIntervals.partitionDisjoint(input));
  }
}
