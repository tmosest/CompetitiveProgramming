package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 822. Card Flipping Game")
class CardFlippingGameTest {

  private CardFlippingGame cardFlippingGame = new CardFlippingGame();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] fronts = {
        1,2,4,4,7
    };
    int[] backs = {
        1,3,4,1,3
    };
    Assertions.assertEquals(2, cardFlippingGame.flipgame(fronts, backs));
  }
}
