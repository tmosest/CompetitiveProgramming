package com.tmosest.CompetitiveProgramming.hackerrank.wcs.wcs12;

import java.util.Scanner;

// Priority UL, UR, R, LR, LL, L
public class RedKnightsShortestPath {

  public static boolean debugMode = false;
  private static String answer = "Impossible";

  private static boolean[][] copyBoard(boolean[][] board) {
    int rows = board.length;
    int columns = board[0].length;
    boolean[][] boardCopy = new boolean[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        boardCopy[i][j] = board[i][j];
      }
    }
    return boardCopy;
  }

  private static void findShortestPath(boolean[][] board, String moves, int i_start, int j_start, int i_end, int j_end) {
    if(i_start == i_end && j_start == j_end) {
      if(debugMode)
        System.out.println("Found the end! " + moves);
      if(answer.equals("Impossible") || 
        (!answer.equals("Impossible") && moves.split(" ").length < answer.split(" ").length)) 
      {
        if(debugMode)
          System.out.println("New answer " + moves);
        answer = moves;
        return;
      }
    }
    if(board[i_start][j_start]) {
      if(debugMode)
        System.out.println("Backtracked!!!!");
        return;
    }
    board[i_start][j_start] = true;
    if(i_start - 2 >= 0 && j_start - 1 >= 0 && !board[i_start - 2][j_start - 1]) {
      if(debugMode)
        System.out.println("Trying UL " + (i_start - 2) + " : " + (j_start - 1));
      boolean[][] copyBoard = copyBoard(board);
      findShortestPath(copyBoard, moves + " UL", i_start - 2, j_start - 1, i_end, j_end);
    }
    if(i_start - 2 >= 0 && j_start + 1 < board[0].length && !board[i_start - 2][j_start + 1]) {
      if(debugMode)
        System.out.println("Trying UR");
      boolean[][] copyBoard = copyBoard(board);
      findShortestPath(copyBoard, moves + " UR", i_start - 2, j_start + 1, i_end, j_end);
    }
    if(j_start + 2 < board[0].length && !board[i_start][j_start + 2]) {
      if(debugMode)
        System.out.println("Trying R");
      boolean[][] copyBoard = copyBoard(board);
      findShortestPath(copyBoard, moves + " R", i_start, j_start + 2, i_end, j_end);
    }
    if(i_start + 2 < board.length && j_start + 1 < board[0].length && !board[i_start + 2][j_start + 1]) {
      if(debugMode)
        System.out.println("Trying LR");
      boolean[][] copyBoard = copyBoard(board);
      findShortestPath(copyBoard, moves + " LR", i_start + 2, j_start + 1, i_end, j_end);
    }
    if(i_start + 2 < board.length && j_start - 1 >= 0 && !board[i_start + 2][j_start - 1]) {
      if(debugMode)
        System.out.println("Trying LL");
      boolean[][] copyBoard = copyBoard(board);
      findShortestPath(copyBoard, moves + " LL", i_start + 2, j_start - 1, i_end, j_end);
    }
    if(j_start - 2 >= 0 && !board[i_start][j_start - 2]) {
      if(debugMode)
        System.out.println("Trying L");
      boolean[][] copyBoard = copyBoard(board);
      findShortestPath(copyBoard, moves + " L", i_start, j_start - 2, i_end, j_end);
    }
  }

  public static String solve() {
    answer = "Impossible";
    Scanner in = new Scanner(System.in);

    int boardSize = in.nextInt();

    int startI = in.nextInt();
    int startJ = in.nextInt();
    int endI = in.nextInt();
    int endJ = in.nextInt();

    in.close();

    boolean[][] board = new boolean[boardSize][boardSize];

    findShortestPath(board, "", startI, startJ, endI, endJ);

    return answer.trim();
  }

  public static void main(String[] args) {
    String ans = solve();
    if (!ans.equals("Impossible"))
      System.out.println(ans.split(" ").length);
    System.out.println(ans);
  }
}
