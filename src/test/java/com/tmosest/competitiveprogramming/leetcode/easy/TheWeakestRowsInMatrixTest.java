package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1337. The K Weakest Rows in a Matrix")
class TheWeakestRowsInMatrixTest {

  private TheWeakestRowsInMatrix theWeakestRowsInMatrix = new TheWeakestRowsInMatrix();

  @Test
  void testCase0() {
    int[][] input =
        {{1,1,0,0,0},
         {1,1,1,1,0},
         {1,0,0,0,0},
         {1,1,0,0,0},
         {1,1,1,1,1}};
    int[] expected = {2,0,3};
    Assertions.assertArrayEquals(expected, theWeakestRowsInMatrix.weakestRows(input, 3));
  }
}
