package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 55. Jump Game")
class JumpGameTest {

  private JumpGame jumpGame = new JumpGame();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        2, 3, 1, 1, 4
    };
    Assertions.assertTrue(jumpGame.canJump(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        3, 2, 1, 0, 4
    };
    Assertions.assertFalse(jumpGame.canJump(input));
  }
}
