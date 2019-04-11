package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@DisplayName("LeetCode: 477. Total Hamming Distance")
public class TotalHammingDistanceTest {

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
