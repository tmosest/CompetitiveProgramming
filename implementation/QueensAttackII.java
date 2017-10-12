package implementation;

import java.util.Scanner;

public class QueensAttackII {

  private static final boolean debugMode = false;

  private static boolean[][] board;

  public static void addBlockersToBoard(int boardSize, int[][] blockers) {
    board = new boolean[0][0];
    if (blockers.length != 0) {
      board = new boolean[boardSize][boardSize];
      for (int b = 0; b < blockers.length; b++) {
        board[blockers[b][0] - 1][blockers[b][1] - 1] = true;
      }
    }
  }

  public static boolean isBlockedFast(int x, int y) {
    if (board.length == 0)
      return false;
    return board[x - 1][y - 1];
  }

  public static long numberOfQueenMovesFast(int boardSize, int[] queenPosition) {
    int movesSize = 0;
    int queenX = queenPosition[0];
    int queenY = queenPosition[1];
    // Look to the queen's left
    if (queenX - 1 >= 1) {
      // Loop and see what we have
      for (int p = queenX - 1; p >= 1; p--) {
        if (isBlockedFast(p, queenY))
          break;
        movesSize++;
      }
    }
    if (debugMode)
      System.out.println("Left Moves: " + movesSize);
    // Look to the queen's right
    if (queenX + 1 <= boardSize) {
      // Loop and see what we have
      for (int p = queenX + 1; p <= boardSize; p++) {
        if (isBlockedFast(p, queenY))
          break;
        movesSize++;
      }
    }
    if (debugMode)
      System.out.println("Right Moves: " + movesSize);
    // Look below the queen
    if (queenY - 1 >= 1) {
      // Loop through and check
      for (int p = queenY - 1; p >= 1; p--) {
        if (isBlockedFast(queenX, p))
          break;
        movesSize++;
      }
    }
    if (debugMode)
      System.out.println("Below Moves: " + movesSize);
    // Look above the queen
    if (queenY + 1 <= boardSize) {
      // Loop through and count
      for (int p = queenY + 1; p <= boardSize; p++) {
        if (isBlockedFast(queenX, p))
          break;
        movesSize++;
      }
    }
    if (debugMode)
      System.out.println("Above Moves: " + movesSize);
    // Reset to Queen Position
    queenX = queenPosition[0];
    queenY = queenPosition[1];
    // Look above and to the right
    if (queenX + 1 <= boardSize && queenY + 1 <= boardSize) {
      while (++queenX <= boardSize && ++queenY <= boardSize && !isBlockedFast(queenX, queenY))
        ++movesSize;
    }
    if (debugMode)
      System.out.println("Above Right Moves: " + movesSize);
    // Reset to Queen Position
    queenX = queenPosition[0];
    queenY = queenPosition[1];
    // Look above and to the left
    if (queenX - 1 >= 1 && queenY + 1 <= boardSize) {
      while (--queenX >= 1 && ++queenY <= boardSize && !isBlockedFast(queenX, queenY))
        ++movesSize;
    }
    if (debugMode)
      System.out.println("Above left Moves: " + movesSize);
    // Reset to Queen Position
    queenX = queenPosition[0];
    queenY = queenPosition[1];
    // Look below and to the right
    if (queenX + 1 <= boardSize && queenY - 1 >= 1) {
      while (++queenX <= boardSize && --queenY >= 1 && !isBlockedFast(queenX, queenY))
        ++movesSize;
    }
    if (debugMode)
      System.out.println("Below Right Moves: " + movesSize);
    // Reset to Queen Position
    queenX = queenPosition[0];
    queenY = queenPosition[1];
    // Look below and to the left
    if (queenX - 1 >= 1 && queenY - 1 >= 1) {
      while (--queenX >= 1 && --queenY >= 1 && !isBlockedFast(queenX, queenY))
        ++movesSize;
    }
    if (debugMode)
      System.out.println("Below Left Moves: " + movesSize);
    return movesSize;
  }

  public static void handleProblemFast() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    board = new boolean[0][0];
    if (k != 0)
      board = new boolean[n][n];
    int[] queen = new int[2];
    queen[0] = in.nextInt();
    queen[1] = in.nextInt();
    for (int a0 = 0; a0 < k; a0++) {
      board[in.nextInt() - 1][in.nextInt() - 1] = true;
    }
    in.close();
    System.out.println(numberOfQueenMovesFast(n, queen));
  }

  public static boolean isBlocked(int x, int y, int[][] blockers) {
    boolean isBlocked = false;
    for (int b = 0; b < blockers.length; b++) {
      if (x == blockers[b][0] && y == blockers[b][1]) {
        isBlocked = true;
        break;
      }
    }
    return isBlocked;
  }

  public static long numberOfQueenMoves(int boardSize, int[] queenPosition, int[][] blockers) {
    int movesSize = 0;
    int queenX = queenPosition[0];
    int queenY = queenPosition[1];
    // Look to the queen's left
    if (queenX - 1 >= 1) {
      // Loop and see what we have
      for (int p = queenX - 1; p >= 1; p--) {
        if (isBlocked(p, queenY, blockers))
          break;
        movesSize++;
      }
    }
    if (debugMode)
      System.out.println("Left Moves: " + movesSize);
    // Look to the queen's right
    if (queenX + 1 <= boardSize) {
      // Loop and see what we have
      for (int p = queenX + 1; p <= boardSize; p++) {
        if (isBlocked(p, queenY, blockers))
          break;
        movesSize++;
      }
    }
    if (debugMode)
      System.out.println("Right Moves: " + movesSize);
    // Look below the queen
    if (queenY - 1 >= 1) {
      // Loop through and check
      for (int p = queenY - 1; p >= 1; p--) {
        if (isBlocked(queenX, p, blockers))
          break;
        movesSize++;
      }
    }
    if (debugMode)
      System.out.println("Below Moves: " + movesSize);
    // Look above the queen
    if (queenY + 1 <= boardSize) {
      // Loop through and count
      for (int p = queenY + 1; p <= boardSize; p++) {
        if (isBlocked(queenX, p, blockers))
          break;
        movesSize++;
      }
    }
    if (debugMode)
      System.out.println("Above Moves: " + movesSize);
    // Reset to Queen Position
    queenX = queenPosition[0];
    queenY = queenPosition[1];
    // Look above and to the right
    if (queenX + 1 <= boardSize && queenY + 1 <= boardSize) {
      while (++queenX <= boardSize && ++queenY <= boardSize && !isBlocked(queenX, queenY, blockers))
        ++movesSize;
    }
    if (debugMode)
      System.out.println("Above Right Moves: " + movesSize);
    // Reset to Queen Position
    queenX = queenPosition[0];
    queenY = queenPosition[1];
    // Look above and to the left
    if (queenX - 1 >= 1 && queenY + 1 <= boardSize) {
      while (--queenX >= 1 && ++queenY <= boardSize && !isBlocked(queenX, queenY, blockers))
        ++movesSize;
    }
    if (debugMode)
      System.out.println("Above left Moves: " + movesSize);
    // Reset to Queen Position
    queenX = queenPosition[0];
    queenY = queenPosition[1];
    // Look below and to the right
    if (queenX + 1 <= boardSize && queenY - 1 >= 1) {
      while (++queenX <= boardSize && --queenY >= 1 && !isBlocked(queenX, queenY, blockers))
        ++movesSize;
    }
    if (debugMode)
      System.out.println("Below Right Moves: " + movesSize);
    // Reset to Queen Position
    queenX = queenPosition[0];
    queenY = queenPosition[1];
    // Look below and to the left
    if (queenX - 1 >= 1 && queenY - 1 >= 1) {
      while (--queenX >= 1 && --queenY >= 1 && !isBlocked(queenX, queenY, blockers))
        ++movesSize;
    }
    if (debugMode)
      System.out.println("Below Left Moves: " + movesSize);
    return movesSize;
  }

  public static void handleProblem() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] queen = new int[2];
    queen[0] = in.nextInt();
    queen[1] = in.nextInt();
    int[][] blockers = new int[k][2];
    for (int a0 = 0; a0 < k; a0++) {
      blockers[a0][0] = in.nextInt();
      blockers[a0][1] = in.nextInt();
    }
    System.out.println(numberOfQueenMoves(n, queen, blockers));
  }

  public static void main(String[] args) {
    handleProblemFast();
  }
}
