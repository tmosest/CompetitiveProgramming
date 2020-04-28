package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("dynamic")
@Tag("april30Day")
@DisplayName("LeetCode: 221. Maximal Square")
class MaximalSquareTest {

  private MaximalSquare maximalSquare = new MaximalSquare();

  @Test
  void testCase0() {
    Assertions.assertEquals(4, maximalSquare.maximalSquare(
        new char[][] {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        }
    ));
  }
}
