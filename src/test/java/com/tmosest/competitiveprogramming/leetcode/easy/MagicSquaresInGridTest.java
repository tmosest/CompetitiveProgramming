package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("matrix")
@DisplayName("LeetCode: 840. Magic Squares In Grid")
class MagicSquaresInGridTest {
	/* Write code here. */

  MagicSquaresInGrid magicSquaresInGrid = new MagicSquaresInGrid();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {4,3,8,4},
        {9,5,1,9},
        {2,7,6,2}
    };
    Assertions.assertEquals(1, magicSquaresInGrid.numMagicSquaresInside(input));
  }


}
