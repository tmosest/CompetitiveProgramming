package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

class SudokuSolver {

  private static Character EMPTY = '.';
  private char[][] boardResult;

  void solveSudoku(char[][] board) {
    boardResult = board;

    helper(board, 0, 0);

    for (int i = 0; i < boardResult.length; i++) {
      for (int j = 0; j < boardResult[0].length; j++) {
        board[i][j] = boardResult[i][j];
      }
    }
  }

  private void helper(char[][] board, int row, int col) {

    if (row >= board.length || col >= board[0].length) {
      return;
    }

    List<Character> moves = getPossibleMoves(board, row, col);

    if (moves.isEmpty()) {
      return;
    }

    int nextCol = col + 1;
    int nextRow = row;
    if (nextCol > board[0].length - 1) {
      nextCol = 0;
      nextRow = row + 1;
    }

    for (Character move : moves) {
      char[][] copy = copy(board);
      copy[row][col] = move;
      helper(copy, nextRow, nextCol);
      if (row == board.length - 1 && col == board[0].length - 1) {
        boardResult = copy;
      }
    }
  }

  private char[][] copy(char[][] board) {
    char[][] copy = new char[board.length][board[0].length];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        copy[i][j] = board[i][j];
      }
    }
    return copy;
  }

  private List<Character> getPossibleMoves(char[][] board, int row, int col) {
    List<Character> moves = new ArrayList<>();

    // if this piece is already filled in
    // then it is the only option
    if (board[row][col] != EMPTY) {
      moves.add(board[row][col]);
      return moves;
    }

    moves = getAllPossibleMoves();

    // check row
    for (int c = 0; c < board[0].length; c++) {
      moves.remove(Character.valueOf(board[row][c]));
    }

    // check col
    for (int r = 0; r < board.length; r++) {
      moves.remove(Character.valueOf(board[r][col]));
    }

    int[][] quadrantBounds = getQuandrantBounds(row, col);
    for (int r = quadrantBounds[0][0]; r < quadrantBounds[1][0]; r++) {
      for (int c = quadrantBounds[0][1]; c < quadrantBounds[1][1]; c++) {
        moves.remove(Character.valueOf(board[r][c]));
      }
    }

    return moves;
  }

  private int[][] getQuandrantBounds(int row, int col) {
    int rowStart = (row / 3) * 3;
    int colStart = (col / 3) * 3;

    int[][] result = {{rowStart, colStart}, {rowStart + 3, colStart + 3}};
    return result;
  }

  private List<Character> getAllPossibleMoves() {
    List<Character> moves = new ArrayList<>();
    for (int i = 0; i < 9; i++) {
      moves.add((char) ((int)'1' + i));
    }
    return moves;
  }
}
