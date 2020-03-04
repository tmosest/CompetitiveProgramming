package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 240. Search a 2D Matrix II")
class Search2dMatrixTwoTest {

  private Search2dMatrixTwo search2dMatrixTwo =
      new Search2dMatrixTwo();
  
  private int[][] input = {
      {1,   4,  7, 11, 15},
      {2,   5,  8, 12, 19},
      {3,   6,  9, 16, 22},
      {10, 13, 14, 17, 24},
      {18, 21, 23, 26, 30}
  };

  @Test
  void testCase0() {
    Assertions.assertTrue(search2dMatrixTwo.searchMatrix(input, 5));
  }

  @Test
  void testCase1() {
    Assertions.assertFalse(search2dMatrixTwo.searchMatrix(input, 20));
  }
}
