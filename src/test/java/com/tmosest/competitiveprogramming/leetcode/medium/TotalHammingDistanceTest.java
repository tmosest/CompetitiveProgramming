package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 477. Total Hamming Distance")
class TotalHammingDistanceTest {
	/* Write code here. */

  TotalHammingDistance totalHammingDistance = new TotalHammingDistance();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        4, 14, 2
    };
    Assertions.assertEquals(6, totalHammingDistance.totalHammingDistance(input));
  }


}
