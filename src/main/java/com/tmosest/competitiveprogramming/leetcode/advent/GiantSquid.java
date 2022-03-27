package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class GiantSquid {

  private static final int BOARD_SIZE = 5;

  long calculateBingoScore(List<String> input, boolean isAll) {
    // Input is scores then bingo boards.
    int[] calls = Arrays
        .stream(input.get(0).split(","))
        .mapToInt(Integer::parseInt)
        .toArray();

    Stack<BingoBoard> bingoBoards = new Stack<>();

    for (int i = 2; i + 4 < input.size(); i += 6) {
      bingoBoards.add(new BingoBoard(input.subList(i, i + 5)));
    }

    for (int call : calls) {
      BingoBoard bingoBoard = bingoBoards.peek();
      Stack<BingoBoard> nextBingoBoards = new Stack<>();
      while (!bingoBoards.isEmpty()) {
        bingoBoard = bingoBoards.pop();
        bingoBoard.markIfPresent(call);
        if (!isAll && bingoBoard.isWinner()) {
          return (long) call * bingoBoard.unmarkedSum();
        }
        if (!bingoBoard.isWinner()) {
          nextBingoBoards.add(0, bingoBoard);
        }
      }
      if (nextBingoBoards.isEmpty()) {
        return (long) call * bingoBoard.unmarkedSum();
      }
      bingoBoards = nextBingoBoards;
    }

    return 0;
  }

  private static class BingoBoard {

    int[][] values = new int[BOARD_SIZE][BOARD_SIZE];
    boolean[][] marked = new boolean[BOARD_SIZE][BOARD_SIZE];

    BingoBoard(List<String> board) {
      values = new int[BOARD_SIZE][BOARD_SIZE];
      for (int i = 0; i < board.size(); i++) {
        String str = board.get(i);

        int[] row = Arrays.stream(str.split(" "))
            .filter(val -> val != null && val.length() > 0)
            .mapToInt(Integer::parseInt)
            .toArray();

        values[i] = row;
      }
    }

    int[] getIndex(int num) {
      for (int i = 0; i < values.length; i++) {
        for (int j = 0; j < values[i].length; j++) {
          if (values[i][j] == num) {
            return new int[]{
                i, j
            };
          }
        }
      }
      return new int[]{
          -1, -1
      };
    }

    void markIfPresent(int num) {
      int[] index = getIndex(num);
      if (index[0] < 0) {
        return;
      }
      marked[index[0]][index[1]] = true;
    }

    boolean isWinner() {
      for (int i = 0; i < marked.length; i++) {
        boolean tmp = true;
        for (int j = 0; j < marked.length; j++) {
          if (!marked[i][j]) {
            tmp = false;
            break;
          }
        }
        if (tmp) {
          return true;
        }

        tmp = true;
        for (int j = 0; j < marked.length; j++) {
          if (!marked[j][i]) {
            tmp = false;
            break;
          }
        }
        if (tmp) {
          return true;
        }
      }

      return false;
    }

    long unmarkedSum() {
      long result = 0;
      for (int i = 0; i < marked.length; i++) {
        for (int j = 0; j < marked.length; j++) {
          if (!marked[i][j]) {
            result += values[i][j];
          }
        }
      }
      return result;
    }
  }
}
