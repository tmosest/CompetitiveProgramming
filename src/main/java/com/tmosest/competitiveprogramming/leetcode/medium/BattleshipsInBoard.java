package com.tmosest.competitiveprogramming.leetcode.medium;

class BattleshipsInBoard {
  /* Write code here. */

  private static char BOAT = 'X';

  /**
   * Determine how many ships are on the board.
   *
   * @param board The board.
   * @return The number of ships on it.
   */
  public int countBattleships(char[][] board) {
    int result = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == BOAT) {
          ++result;
          dfs(board, i, j);
        }
      }
    }
    return result;
  }

  private void dfs(char[][] board, int row, int col) {
    if (row < 0
        || col < 0
        || row >= board.length
        || col >= board[0].length
        || board[row][col] != BOAT) {
      return;
    }
    board[row][col] = '.';
    dfs(board, row - 1, col);
    dfs(board, row + 1, col);
    dfs(board, row, col - 1);
    dfs(board, row, col + 1);
  }


}
