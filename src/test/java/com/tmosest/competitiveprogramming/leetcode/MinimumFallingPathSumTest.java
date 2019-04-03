package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("dynamic")
@Tag("matrix")
@DisplayName("LeetCode: 611. Valid Triangle Number")
public class MinimumFallingPathSumTest {

  MinimumFallingPathSum minimumFallingPathSum = new MinimumFallingPathSum();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {1,2,3},{4,5,6},{7,8,9}
    };
    Assertions.assertEquals(12, minimumFallingPathSum.minFallingPathSum(input));
  }
}
