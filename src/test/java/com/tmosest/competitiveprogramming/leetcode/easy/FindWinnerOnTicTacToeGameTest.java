package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1275. Find Winner on a Tic Tac Toe Game")
class FindWinnerOnTicTacToeGameTest {

  @Test
  void testCase0() {
    int[][] moves = {{0,0},{2,0},{1,1},{2,1},{2,2}};
    Assertions.assertEquals("A", new FindWinnerOnTicTacToeGame().tictactoe(moves));
  }
}
