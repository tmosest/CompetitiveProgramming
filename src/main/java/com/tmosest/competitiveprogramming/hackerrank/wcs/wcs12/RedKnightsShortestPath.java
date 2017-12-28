package com.tmosest.competitiveprogramming.hackerrank.wcs.wcs12;

import java.util.Scanner;

// Priority UL, UR, R, LR, LL, L
public class RedKnightsShortestPath {

  public static boolean debugMode = false;
  private static String answer = "Impossible";

  private static String printShortestPath(int istart, int jstart, int iend, int jend) {
    if (debugMode) {
      System.out.println("=================================================");
      System.out.println("Start");
      System.out
          .println("i_start: " + istart + " j_start: " + " i_end: " + iend + " j_end: " + jend);
    }
    String impossilbe = "Impossible";
    int verticlesMoves = istart - iend;
    int horizontalMoves = jend - jstart;
    if (debugMode) {
      System.out.println("verticlesMoves: " + verticlesMoves);
      System.out.println("horizontalMoves: " + horizontalMoves);
    }
    if (verticlesMoves % 2 != 0) {
      return impossilbe;
    }
    int horizontalMovesLeft = 0;
    if (Math.abs(horizontalMoves) >= Math.abs(verticlesMoves / 2)) {
      horizontalMovesLeft = Math.abs(horizontalMoves) - Math.abs(verticlesMoves / 2);
    }
    if (debugMode) {
      System.out.println("horizontalMovesLeft: " + horizontalMovesLeft);
      System.out.println("=================================================");
    }
    if (horizontalMovesLeft % 2 != 0) {
      return impossilbe;
    }
    StringBuilder moves = new StringBuilder();
    while (horizontalMoves != 0 || verticlesMoves != 0) {
      if (debugMode) {
        System.out.println("=================================================");
        System.out.println("verticlesMoves: " + verticlesMoves);
        System.out.println("horizontalMoves: " + horizontalMoves);
        System.out.println("horizontalMovesLeft: " + horizontalMovesLeft);
        System.out.println("moves: " + moves.toString());
        System.out.println("=================================================");
      }
      if (verticlesMoves > 0 && horizontalMoves <= 0) {
        moves.append("UL ");
        if (debugMode) {
          System.out.println("moves: " + moves.toString());
        }
        verticlesMoves -= 2;
        horizontalMoves += 1;
      } else if (verticlesMoves > 0 && horizontalMoves >= 0) {
        moves.append("UR ");
        if (debugMode) {
          System.out.println("moves: " + moves.toString());
        }
        verticlesMoves -= 2;
        horizontalMoves -= 1;
      } else if (horizontalMovesLeft > 0 && horizontalMoves > 0) {
        moves.append("R ");
        if (debugMode) {
          System.out.println("moves: " + moves.toString());
        }
        horizontalMovesLeft -= 2;
        horizontalMoves -= 2;
      } else if (verticlesMoves < 0 && horizontalMoves >= 0) {
        moves.append("LR ");
        if (debugMode) {
          System.out.println("moves: " + moves.toString());
        }
        verticlesMoves += 2;
        horizontalMoves -= 1;
      } else if (verticlesMoves < 0 && horizontalMoves <= 0) {
        moves.append("LL ");
        if (debugMode) {
          System.out.println("moves: " + moves.toString());
        }
        verticlesMoves += 2;
        horizontalMoves += 1;
      } else if (horizontalMovesLeft > 0 && horizontalMoves <= 0) {
        moves.append("L ");
        if (debugMode) {
          System.out.println("moves: " + moves.toString());
        }
        horizontalMovesLeft -= 2;
        horizontalMoves += 2;
      }
    }
    // Need to make sure order was correct just in case;
    String[] movesArray = moves.toString().trim().split(" ");
    StringBuilder orderedMoves = new StringBuilder();
    String[] order = {"UL", "UR", "R", "LR", "LL", "L"};
    for (String cl : order) {
      for (int i = 0; i < movesArray.length; i++) {
        if (movesArray[i].equals(cl)) {
          orderedMoves.append(cl + " ");
        }
      }
    }
    return orderedMoves.toString().trim();
  }

  /**
   * Function to test the problem.
   *
   * @return String result.
   */
  public static String solve() {
    answer = "Impossible";
    Scanner in = new Scanner(System.in);
    int boardSize = in.nextInt();
    int startI = in.nextInt();
    int startJ = in.nextInt();
    int endI = in.nextInt();
    int endJ = in.nextInt();
    in.close();
    return printShortestPath(startI, startJ, endI, endJ);
  }

  /**
   * Main function.
   *
   * @param args String array.
   */
  public static void main(String[] args) {
    String ans = solve();
    if (!ans.equals("Impossible")) {
      System.out.println(ans.split(" ").length);
    }
    System.out.println(ans);
  }
}
