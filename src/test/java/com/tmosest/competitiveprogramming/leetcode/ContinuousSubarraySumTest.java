package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContinuousSubarraySumTest {

  ContinuousSubarraySum continuousSubarraySum = new ContinuousSubarraySum();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        23, 2, 4, 6, 7
    };
    Assertions.assertTrue(continuousSubarraySum.checkSubarraySum(input, 6));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        23, 2, 6, 4, 7
    };
    Assertions.assertTrue(continuousSubarraySum.checkSubarraySum(input, 6));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] input = {
        0, 0
    };
    Assertions.assertTrue(continuousSubarraySum.checkSubarraySum(input, 0));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[] input = {
        23,2,6,4,7
    };
    Assertions.assertFalse(continuousSubarraySum.checkSubarraySum(input, 0));
  }
}
