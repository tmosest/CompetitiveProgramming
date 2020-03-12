package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 279. Perfect Squares")
class PerfectSquaresTest {

  private PerfectSquares perfectSquares = new PerfectSquares();

  @Test
  void testCase0() {
    Assertions.assertEquals(3, perfectSquares.numSquares(12));
  }
}
