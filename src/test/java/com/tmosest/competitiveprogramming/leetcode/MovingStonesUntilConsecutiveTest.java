package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1033. Moving Stones Until Consecutive")
class MovingStonesUntilConsecutiveTest {

  private MovingStonesUntilConsecutive movingStonesUntilConsecutive = new MovingStonesUntilConsecutive();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] expected = {1, 2};
    Assertions.assertArrayEquals(expected, movingStonesUntilConsecutive.numMovesStones(1, 2, 5));
  }
}
