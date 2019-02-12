package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("grid")
@DisplayName("LeetCode: 766. Toeplitz Matrix")
public class ToeplitzMatrixTest {

  ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] matrix = {
      {1,2,3,4},
      {5,1,2,3},
      {9,5,1,2}
    };
    Assertions.assertTrue(toeplitzMatrix.isToeplitzMatrix(matrix));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[][] matrix = {
        {1, 2},
        {2, 2}
    };
    Assertions.assertFalse(toeplitzMatrix.isToeplitzMatrix(matrix));
  }
}
