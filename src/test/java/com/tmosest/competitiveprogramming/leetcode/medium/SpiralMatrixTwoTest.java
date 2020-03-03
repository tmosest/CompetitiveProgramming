package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 59. Spiral Matrix II")
class SpiralMatrixTwoTest {

  private SpiralMatrixTwo spiralMatrixTwo = new SpiralMatrixTwo();

  @Test
  void testCase0() {
    int[][] expected = {
      { 1, 2, 3 },
      { 8, 9, 4 },
      { 7, 6, 5 }
    };
    Assertions.assertArrayEquals(expected, spiralMatrixTwo.generateMatrix(3));
  }
}
