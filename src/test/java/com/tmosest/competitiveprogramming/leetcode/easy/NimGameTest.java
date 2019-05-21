package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("gameTheory")
@DisplayName("LeetCode: 292. Nim Game")
class NimGameTest {
	/* Write code here. */

  NimGame nimGame = new NimGame();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertFalse(nimGame.canWinNim(4));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertTrue(nimGame.canWinNim(3));
  }


}
