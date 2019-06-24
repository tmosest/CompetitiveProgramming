package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

class SurroundedRegions {

  private char[][] board;

  /**
   * O's surrounded in X's become X's.
   *
   * @param board The board of X's and O's
   */
  void solve(char[][] board) {
    this.board = board;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == 'O') {
          Set<int[]> points = new HashSet<>();
          helper(points, i, j);
          if (shouldConvert(points)) {
            for (int[] point : points) {
              board[point[0]][point[1]] = 'X';
            }
          }
        }
      }
    }
  }

  private void helper(Set<int[]> points, int row, int col) {
    if (row < 0 || col < 0 || row >= board.length || col >= board[0].length
        || board[row][col] != 'O') {
      return;
    }
    int[] point = {row, col};
    points.add(point);
    board[row][col] = 'V';
    helper(points, row - 1, col);
    helper(points, row + 1, col);
    helper(points, row, col - 1);
    helper(points, row, col + 1);
    board[row][col] = 'O';
  }

  private boolean shouldConvert(Set<int[]> points) {
    for (int[] point : points) {
      if (point[0] == 0
          || point[1] == 0
          || point[0] == board.length - 1
          || point[1] == board[0].length - 1
      ) {
        return false;
      }
    }
    return true;
  }
}
