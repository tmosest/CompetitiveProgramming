package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("array")
@Tag("easy")
@DisplayName("LeetCode: 1020. Partition Array Into Three Parts With Equal Sum")
public class PartitionArrayIntoThreePartsWithEqualSumTest {

  PartitionArrayIntoThreePartsWithEqualSum partitionArrayIntoThreePartsWithEqualSum = new PartitionArrayIntoThreePartsWithEqualSum();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        0,2,1,-6,6,-7,9,1,2,0,1
    };
    Assertions.assertTrue(partitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        0,2,1,-6,6,7,9,-1,2,0,1
    };
    Assertions.assertFalse(partitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(input));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] input = {
        3,3,6,5,-2,2,5,1,-9,4
    };
    Assertions.assertTrue(partitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(input));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[] input = {
        12,-4,16,-5,9,-3,3,8,0
    };
    Assertions.assertTrue(partitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(input));
  }
}
