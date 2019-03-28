package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 152. Maximum Product Subarray")
public class MaximumProductSubarrayTest {

  MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        2,3,-2,4
    };
    Assertions.assertEquals(6, maximumProductSubarray.maxProduct(input));
  }
}
