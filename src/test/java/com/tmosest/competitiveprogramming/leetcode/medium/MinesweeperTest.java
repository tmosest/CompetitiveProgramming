package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("depthFirstSearch")
@Tag("matrix")
@DisplayName("LeetCode: 529. Minesweeper")
class MinesweeperTest {
	/* Write code here. */

  Minesweeper minesweeper = new Minesweeper();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    char[][] board = {
        {'E', 'E', 'E', 'E', 'E'},
        {'E', 'E', 'M', 'E', 'E'},
        {'E', 'E', 'E', 'E', 'E'},
        {'E', 'E', 'E', 'E', 'E'}
    };
    int[] click = {3, 0};
    char[][] expected = {
        {'B', '1', 'E', '1', 'B'},
        {'B', '1', 'M', '1', 'B'},
        {'B', '1', '1', '1', 'B'},
        {'B', 'B', 'B', 'B', 'B'}
    };
    Assertions.assertArrayEquals(expected, minesweeper.updateBoard(board, click));
  }


}
