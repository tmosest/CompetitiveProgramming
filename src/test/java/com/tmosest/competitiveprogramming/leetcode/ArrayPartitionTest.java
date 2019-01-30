package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 561. Array Partition I")
public class ArrayPartitionTest {

  ArrayPartition arrayPartition = new ArrayPartition();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {1,4,3,2};
    Assertions.assertEquals(4, arrayPartition.arrayPairSum(input));
  }
}
