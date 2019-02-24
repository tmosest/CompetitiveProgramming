package com.tmosest.competitiveprogramming.leetcode;

public class AvailableCapturesForRook {

  /**
   * Determine the number of pieces that a rook could capture.
   * @param board Matrix of characters that represents the chess board.
   * @return The number of opponent pawns that could be captured.
   */
  public int numRookCaptures(char[][] board) {
    int captures = 0;
    int[] rook = findRook(board);
    if (rook[0] == -1) {
      return captures;
    }
    // up
    for (int i = rook[0]; i >= 0; i--) {
      if (board[i][rook[1]] == 'p') {
        ++captures;
        break;
      }
      if (board[i][rook[1]] == 'B') {
        break;
      }
    }
    // down
    for (int i = rook[0]; i < board.length; i++) {
      if (board[i][rook[1]] == 'p') {
        ++captures;
        break;
      }
      if (board[i][rook[1]] == 'B') {
        break;
      }
    }
    // left
    for (int i = rook[1]; i >= 0; i--) {
      if (board[rook[0]][i] == 'p') {
        ++captures;
        break;
      }
      if (board[rook[0]][i] == 'B') {
        break;
      }
    }
    // right
    for (int i = rook[1]; i < board.length; i++) {
      if (board[rook[0]][i] == 'p') {
        ++captures;
        break;
      }
      if (board[rook[0]][i] == 'B') {
        break;
      }
    }
    return captures;
  }

  private int[] findRook(char[][] board) {
    int[] rook = {-1, -1};
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == 'R') {
          rook[0] = i;
          rook[1] = j;
          break;
        }
      }
    }
    return rook;
  }
}
