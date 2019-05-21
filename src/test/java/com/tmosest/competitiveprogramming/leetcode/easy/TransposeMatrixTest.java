package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@DisplayName("LeetCode: 867. Transpose Matrix")
class TransposeMatrixTest {
	/* Write code here. */

  TransposeMatrix transposeMatrix = new TransposeMatrix();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] expected = {{1,4,7},{2,5,8},{3,6,9}};
    Assertions.assertArrayEquals(expected, transposeMatrix.transpose(input));
  }


}
