package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@DisplayName("LeetCode: 679. 24 Game")
class TwentyFourGameTest {

  private TwentyFourGame twentyFourGame = new TwentyFourGame();

  @Test
  void testCase0() {
    int[] input = {4, 1, 8, 7};
    Assertions.assertTrue(twentyFourGame.judgePoint24(input));
  }

  @Test
  void testCase1() {
    int[] input = {1, 2, 1, 2};
    Assertions.assertFalse(twentyFourGame.judgePoint24(input));
  }
}
