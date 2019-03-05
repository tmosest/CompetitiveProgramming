package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 643. Maximum Average Subarray I")
public class MaximumAverageSubarrayTest {

  MaximumAverageSubarray maximumAverageSubarray = new MaximumAverageSubarray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,12,-5,-6,50,3
    };
    Assertions.assertEquals(12.75, maximumAverageSubarray.findMaxAverage(input, 4));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        1,12,-5,-6,50,3
    };
    Assertions.assertEquals(50, maximumAverageSubarray.findMaxAverage(input, 1));
  }
}
