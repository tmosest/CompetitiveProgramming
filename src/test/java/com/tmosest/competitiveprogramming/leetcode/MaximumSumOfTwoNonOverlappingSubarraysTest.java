package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@DisplayName("LeetCode: 1031. Maximum Sum of Two Non-Overlapping Subarrays")
class MaximumSumOfTwoNonOverlappingSubarraysTest {

  private MaximumSumOfTwoNonOverlappingSubarrays maximumSumOfTwoNonOverlappingSubarrays = new MaximumSumOfTwoNonOverlappingSubarrays();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        0,6,5,2,2,5,1,9,4
    };
    Assertions.assertEquals(20, maximumSumOfTwoNonOverlappingSubarrays.maxSumTwoNoOverlap(input, 1, 2));
  }
}
