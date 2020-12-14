package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@Tag("bwc35")
@DisplayName("LeetCode: 1572. Matrix Diagonal Sum")
class MatrixDiagonalSumTest {

  private MatrixDiagonalSum matrixDiagonalSum;

  @BeforeEach
  void setup() {
    matrixDiagonalSum = new MatrixDiagonalSum();
  }

  private void test(int output, int[][] mat) {
    Assertions.assertEquals(output, matrixDiagonalSum.diagonalSum(mat));
  }

  @Test
  void test0() {
    test(25, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
  }
}
