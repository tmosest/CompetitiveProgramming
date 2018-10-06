package com.tmosest.competitiveprogramming.hackerrank.woc.week36;

import java.util.Scanner;

public class WaysToGiveACheck {

  public static boolean debugMode = false;
  private static final int BOARD_SIZE = 8;

  private abstract static class Piece {

  }

  private static class Board implements Cloneable {

    private Piece[][] game;

    public Board() {
      game = new Piece[BOARD_SIZE][BOARD_SIZE];
    }

    public Board clone() throws CloneNotSupportedException {
      Board clone = (Board) super.clone();
      return clone;
    }
  }

  public static String solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    int[] results = new int[tests];
    for (int t = 0; t < tests; t++) {
      // Create Board
      String[] board = new String[BOARD_SIZE];
      for (int i = 0; i < BOARD_SIZE; i++) {
        board[i] = in.next();
      }
    }
    in.close();
    return "";
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }
}
