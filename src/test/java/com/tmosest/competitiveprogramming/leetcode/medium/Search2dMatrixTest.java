package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 74. Search a 2D Matrix")
class Search2dMatrixTest {

  private Search2dMatrix search2dMatrix = new Search2dMatrix();

  @Test
  void testCase0() {
    int[][] matrix = {
      {1,   3,  5,  7},
      {10, 11, 16, 20},
      {23, 30, 34, 50}
    };
    Assertions.assertTrue(search2dMatrix.searchMatrix(matrix, 3));
  }

  @Test
  void testCase1() {
    int[][] matrix = {
      {1,   3,  5,  7},
      {10, 11, 16, 20},
      {23, 30, 34, 50}
    };
    Assertions.assertFalse(search2dMatrix.searchMatrix(matrix, 13));
  }

  @Test
  void testCase2() {
    int[][] matrix = {
    };
    Assertions.assertFalse(search2dMatrix.searchMatrix(matrix, 13));
  }

  @Test
  void testCase3() {
    int[][] matrix = {
        {1}
    };
    Assertions.assertTrue(search2dMatrix.searchMatrix(matrix, 1));
  }
}
