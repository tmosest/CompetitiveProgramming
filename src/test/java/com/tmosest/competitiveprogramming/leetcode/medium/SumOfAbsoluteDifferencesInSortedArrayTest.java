package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("bwc41")
@DisplayName("LeetCode: 1685. Sum of Absolute Differences in a Sorted Array")
class SumOfAbsoluteDifferencesInSortedArrayTest {

  private SumOfAbsoluteDifferencesInSortedArray sumOfAbsoluteDifferencesInSortedArray;

  @BeforeEach
  void setup() {
    sumOfAbsoluteDifferencesInSortedArray = new SumOfAbsoluteDifferencesInSortedArray();
  }

  private void test(int[] output, int[] nums) {
    Assertions.assertArrayEquals(output,
        sumOfAbsoluteDifferencesInSortedArray.getSumAbsoluteDifferences(nums));
  }

  @Test
  void test0() {
    test(new int[] {4,3,5}, new int[] {2,3,5});
  }
}
