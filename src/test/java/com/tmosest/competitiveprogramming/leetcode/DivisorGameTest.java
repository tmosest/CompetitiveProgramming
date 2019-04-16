package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("number")
@DisplayName("LeetCode: 1025. Divisor Game")
class DivisorGameTest {

  private DivisorGame divisorGame = new DivisorGame();

  @Test
  @DisplayName("2 is true")
  void testCase0() {
    Assertions.assertTrue(divisorGame.divisorGame(2));
  }

  @Test
  @DisplayName("3 is false")
  void testCase1() {
    Assertions.assertFalse(divisorGame.divisorGame(3));
  }
}
