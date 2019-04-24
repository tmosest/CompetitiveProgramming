package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("string")
@DisplayName("LeetCode: 794. Valid Tic-Tac-Toe State")
class ValidTicTacToeStateTest {

  private ValidTicTacToeState validTicTacToeState = new ValidTicTacToeState();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] board = {
        "O  ", "   ", "   "
    };
    Assertions.assertFalse(validTicTacToeState.validTicTacToe(board));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] board = {
        "XOX", "O O", "XOX"
    };
    Assertions.assertTrue(validTicTacToeState.validTicTacToe(board));
  }
}
