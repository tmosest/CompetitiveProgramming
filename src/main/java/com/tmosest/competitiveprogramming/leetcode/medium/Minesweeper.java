package com.tmosest.competitiveprogramming.leetcode.medium;

class Minesweeper {
  /* Write code here. */

  private static void dfs(char[][] board, int row, int col) {
    if (row >= board.length
        || row < 0
        || col >= board[0].length
        || col < 0
        || board[row][col] == 'B'
        ) {
      return;
    }
    // handle mine
    if (board[row][col] == 'M') {
      board[row][col] = 'X';
      return;
    }
    // handle point next to a mine
    int bombCount = 0;
    if (row - 1 >= 0) {
      if (board[row - 1][col] == 'M') {
        bombCount++;
      }
      if (col - 1 >= 0) {
        if (board[row - 1][col - 1] == 'M') {
          bombCount++;
        }
      }
      if (col + 1 < board[0].length) {
        if (board[row - 1][col + 1] == 'M') {
          bombCount++;
        }
      }
    }
    if (row + 1 < board.length) {
      if (board[row + 1][col] == 'M') {
        bombCount++;
      }
      if (col - 1 >= 0) {
        if (board[row + 1][col - 1] == 'M') {
          bombCount++;
        }
      }
      if (col + 1 < board[0].length) {
        if (board[row + 1][col + 1] == 'M') {
          bombCount++;
        }
      }
    }
    if (col - 1 >= 0) {
      if (board[row][col - 1] == 'M') {
        bombCount++;
      }
    }
    if (col + 1 < board[0].length) {
      if (board[row][col + 1] == 'M') {
        bombCount++;
      }
    }
    if (bombCount == 0) {
      board[row][col] = 'B';
      dfs(board, row - 1, col);
      dfs(board, row - 1, col - 1);
      dfs(board, row - 1, col + 1);
      dfs(board, row + 1, col);
      dfs(board, row + 1, col - 1);
      dfs(board, row + 1, col + 1);
      dfs(board, row, col - 1);
      dfs(board, row, col + 1);
      return;
    }
    board[row][col] = (char) (bombCount + '0');
  }

  /**
   * Plays one turn of minesweeper.
   *
   * @param board The state of the current board.
   * @param click The location of the click.
   * @return The new state of the board.
   */
  public char[][] updateBoard(char[][] board, int[] click) {
    char[][] result = board.clone();
    dfs(result, click[0], click[1]);
    return result;
  }


}
