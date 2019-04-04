package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@DisplayName("LeetCode: 542. 01 Matrix")
public class ZeroOneMatrixTest {

  ZeroOneMatrix zeroOneMatrix = new ZeroOneMatrix();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {0, 0, 0},
        {0, 1, 0},
        {0, 0, 0}
    };
    int[][] output = {
        {0, 0, 0},
        {0, 1, 0},
        {0, 0, 0}
    };
    Assertions.assertArrayEquals(output, zeroOneMatrix.updateMatrix(input));
  }
}
