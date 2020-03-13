package com.tmosest.competitiveprogramming.leetcode.hard;

class NqueensTwo {

  private static final Nqueens nqueens = new Nqueens();

  int totalNQueens(int num) {
    return nqueens.solveNQueens(num).size();
  }
}
