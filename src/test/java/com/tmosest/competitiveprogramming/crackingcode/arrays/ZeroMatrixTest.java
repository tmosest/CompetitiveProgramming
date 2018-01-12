package com.tmosest.competitiveprogramming.crackingcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZeroMatrixTest {

  @Test
  void testCase0() {
    int[][] matrix = {
        {1 , 0},
        {1 , 1}
    };
    int[][] result = {
        {0 , 0},
        {1 , 0}
    };
    Assertions.assertArrayEquals(result, ZeroMatrix.zeroMatrix(matrix));
  }

  @Test
  void testCase1() {
    int[][] matrix = {
        {1 , 1},
        {1 , 1},
        {0 , 1}
    };
    int[][] result = {
        {0 , 1},
        {0 , 1},
        {0 , 0}
    };
    Assertions.assertArrayEquals(result, ZeroMatrix.zeroMatrix(matrix));
  }

  @Test
  void testCase2() {
    int[][] matrix = {
        {1 , 1, 0},
        {1 , 0, 1},
        {0 , 1, 0}
    };
    int[][] result = {
        {0 , 0, 0},
        {0 , 0, 0},
        {0 , 0, 0}
    };
    Assertions.assertArrayEquals(result, ZeroMatrix.zeroMatrix(matrix));
  }
}
