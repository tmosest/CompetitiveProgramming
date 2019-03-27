package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("breadthFirstSearch")
@Tag("matrix")
@DisplayName("LeetCode: 64. Minimum Path Sum")
public class MinimumPathSumTest {

  MinimumPathSum minimumPathSum = new MinimumPathSum();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {1,3,1},
        {1,5,1},
        {4,2,1}
    };
    Assertions.assertEquals(7, minimumPathSum.minPathSum(input));
  }
}
