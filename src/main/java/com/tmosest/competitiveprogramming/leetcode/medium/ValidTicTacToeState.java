package com.tmosest.competitiveprogramming.leetcode.medium;

class ValidTicTacToeState {
  /* Write code here. */

  /**
   * Determine if the current setup is a valid tic-tac-toe state.
   *
   * @param board The current state of the board.
   * @return True if this is a valid state of the board.
   */
  boolean validTicTacToe(String[] board) {
    int xcount = 0;
    int ocount = 0;
    for (String row : board) {
      for (char c : row.toCharArray()) {
        if (c == 'X') {
          xcount++;
        }
        if (c == 'O') {
          ocount++;
        }
      }
    }
    if (ocount != xcount && ocount != xcount - 1) {
      return false;
    }
    if (win(board, 'X') && ocount != xcount - 1) {
      return false;
    }
    if (win(board, 'O') && ocount != xcount) {
      return false;
    }
    return true;
  }

  private boolean win(String[] board, char player) {
    for (int i = 0; i < 3; ++i) {
      if (player == board[0].charAt(i)
          && player == board[1].charAt(i)
          && player == board[2].charAt(i)) {
        return true;
      }
      if (player == board[i].charAt(0)
          && player == board[i].charAt(1)
          && player == board[i].charAt(2)) {
        return true;
      }
    }
    if (player == board[0].charAt(0)
        && player == board[1].charAt(1)
        && player == board[2].charAt(2)) {
      return true;
    }
    return player == board[0].charAt(2)
        && player == board[1].charAt(1)
        && player == board[2].charAt(0);
  }


}
