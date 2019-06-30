package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1091. Shortest Path in Binary Matrix")
class ShortestPathInBinaryMatrixTest {

  private ShortestPathInBinaryMatrix shortestPathInBinaryMatrix = new ShortestPathInBinaryMatrix();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] grid = {
        {0, 1},
        {1, 0}
    };
    Assertions.assertEquals(2, shortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[][] grid = {
        {0, 0, 0},
        {1, 1, 0},
        {1, 1, 0}
    };
    Assertions.assertEquals(4, shortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[][] grid = {
        {0, 0, 0},
        {1, 1, 0},
        {1, 1, 1}
    };
    Assertions.assertEquals(-1, shortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid));
  }
}
