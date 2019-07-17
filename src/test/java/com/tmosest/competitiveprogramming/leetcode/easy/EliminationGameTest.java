package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 390. Elimination Game")
class EliminationGameTest {

  private EliminationGame eliminationGame = new EliminationGame();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(6, eliminationGame.lastRemaining(9));
  }
}
