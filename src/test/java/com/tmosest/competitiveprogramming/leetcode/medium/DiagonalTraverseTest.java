package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("matrix")
@DisplayName("LeetCode: 109. Convert Sorted List to Binary Search Tree")
class DiagonalTraverseTest {
	/* Write code here. */

  private DiagonalTraverse diagonalTraverse = new DiagonalTraverse();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    int[] output = {
        1,2,4,7,5,3,6,8,9
    };
    Assertions.assertArrayEquals(output, diagonalTraverse.findDiagonalOrder(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[][] input = {};
    int[] output = {};
    Assertions.assertArrayEquals(output, diagonalTraverse.findDiagonalOrder(input));
  }


}
