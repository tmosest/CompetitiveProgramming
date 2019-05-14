package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("depthFirstSearch")
@Tag("matrix")
@DisplayName("LeetCode: 419. Battleships in a Board")
class BattleshipsInBoardTest {
	/* Write code here. */

  BattleshipsInBoard battleshipsInBoard = new BattleshipsInBoard();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    char[][] board = {
        {'X', '.', '.', 'X'},
        {'.', '.', '.', 'X'},
        {'.', '.', '.', 'X'}
    };
    Assertions.assertEquals(2, battleshipsInBoard.countBattleships(board));
  }


}
