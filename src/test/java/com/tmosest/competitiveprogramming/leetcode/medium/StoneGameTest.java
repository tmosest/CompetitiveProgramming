package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 877. Stone Game")
class StoneGameTest {

  private StoneGame stoneGame = new StoneGame();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        5,3,4,5
    };
    Assertions.assertTrue(stoneGame.stoneGame(input));
  }
}
