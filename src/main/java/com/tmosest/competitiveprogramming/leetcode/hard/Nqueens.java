package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

class Nqueens {

  private static final char QUEEN = 'Q';

  List<List<String>> solveNQueens(int num) {
    List<List<String>> results = new ArrayList<>();

    char[][] board = new char[num][num];
    placeQueens(board, 0, results, num);

    return results;
  }

  void placeQueens(char[][] board, int row, List<List<String>> results, int queensLeft) {

    if (queensLeft == 0) {
      results.add(toStringList(board));
    }

    if (row >= board.length) {
      return;
    }

    for (int i = 0; i < board[0].length; i++) {
      if (canPlaceQueen(board, row, i)) {
        char[][] copy = copy(board);
        placeQueen(copy, row, i);
        placeQueens(copy, row + 1, results, queensLeft - 1);
      }
    }
  }

  private boolean canPlaceQueen(char[][] board, int row, int col) {

    if (board[row][col] != Character.MIN_VALUE) {
      return false;
    }

    for (int i = 0; i < board[0].length; i++) {
      if (board[row][i] == QUEEN) {
        return false;
      }
    }

    for (int i = 0; i < board.length; i++) {
      if (board[i][col] == QUEEN) {
        return false;
      }
    }

    for (int i = 1; row + i < board.length && col + i < board.length; i++) {
      if (board[row + i][col + i] == QUEEN) {
        return false;
      }
    }

    for (int i = 1; row - i >= 0 && col - i >= 0; i++) {
      if (board[row - i][col - i] == QUEEN) {
        return false;
      }
    }

    for (int i = 1; row + i < board.length && col - i >= 0; i++) {
      if (board[row + i][col - i] == QUEEN) {
        return false;
      }
    }

    for (int i = 1; row - i >= 0 && col + i < board.length; i++) {
      if (board[row - i][col + i] == QUEEN) {
        return false;
      }
    }

    return true;
  }

  private void placeQueen(char[][] board, int row, int col) {
    board[row][col] = QUEEN;
  }

  private char[][] copy(char[][] board) {
    char[][] copy = new char[board.length][board.length];

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        copy[i][j] = board[i][j];
      }
    }

    return copy;
  }

  private List<String> toStringList(char[][] board) {
    List<String> result = new ArrayList<>();

    for (char[] line : board) {
      StringBuilder sb = new StringBuilder();
      for (char letter : line) {
        sb.append(Character.MIN_VALUE == letter ? '.' : letter);
      }
      result.add(sb.toString());
    }

    return result;
  }
}
