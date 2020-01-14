package com.tmosest.competitiveprogramming.leetcode.easy;

class FindWinnerOnTicTacToeGame {

  public String tictactoe(int[][] moves) {
    if (moves == null || moves.length < 5) {
      return "Pending";
    }
    int[][] grid = new int[3][3];
    for (int i = 0; i < moves.length; i++) {
      if (i % 2 == 0) {   // 'A'
        grid[moves[i][0]][moves[i][1]] = 1;
        if (win(grid, 1)) {
          return "A";
        }
      } else { // 'B'
        grid[moves[i][0]][moves[i][1]] = -1;
        if (win(grid, -1)) {
          return "B";
        }
      }
    }
    return moves.length < 9 ? "Pending" : "Draw";
  }

  private boolean win(int[][] grid, int target) {
    return ((grid[0][0] == target && grid[1][1] == target && grid[2][2] == target)
        || (grid[2][0] == target && grid[1][1] == target && grid[0][2] == target)
        || (grid[0][0] == target && grid[0][1] == target && grid[0][2] == target)
        || (grid[0][0] == target && grid[1][0] == target && grid[2][0] == target)
        || (grid[2][0] == target && grid[2][1] == target && grid[2][2] == target)
        || (grid[0][2] == target && grid[1][2] == target && grid[2][2] == target)
        || (grid[0][1] == target && grid[1][1] == target && grid[2][1] == target)
        || (grid[1][0] == target && grid[1][1] == target && grid[1][2] == target));
  }
}
