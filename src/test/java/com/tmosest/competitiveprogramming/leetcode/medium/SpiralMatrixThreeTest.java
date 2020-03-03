package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 885. Spiral Matrix III")
class SpiralMatrixThreeTest {

  private SpiralMatrixThree spiralMatrixThree = new SpiralMatrixThree();

  @Test
  void testCase0() {
    int[][] expected = 
      {
          {1,4},{1,5},{2,5},
          {2,4},{2,3},{1,3},
          {0,3},{0,4},{0,5},
          {3,5},{3,4},{3,3},
          {3,2},{2,2},{1,2},
          {0,2},{4,5},{4,4},
          {4,3},{4,2},{4,1},
          {3,1},{2,1},{1,1},
          {0,1},{4,0},{3,0},
          {2,0},{1,0},{0,0}
      };
    Assertions.assertArrayEquals(expected, spiralMatrixThree.spiralMatrix(5,6, 1, 4));
  }

  @Test
  void testCase1() {
    int[][] expected =
        {{0,0},{0,1},{0,2},{0,3}};
    Assertions.assertArrayEquals(expected, spiralMatrixThree.spiralMatrix(1,4, 0, 0));
  }
}
