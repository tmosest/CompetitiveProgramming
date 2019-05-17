package com.tmosest.competitiveprogramming.kata.twentyfourtyeight;

import java.util.Random;

public class TwentyFortyEightGame {

  private int boardSize = 4;
  private int[][] board = new int[boardSize][boardSize];
  private int score = 0;
  private int openSpots = boardSize * boardSize;

  /**
   * Create a new game class.
   */
  public TwentyFortyEightGame() {
    startNewGame();
  }

  /**
   * Reset the game.
   */
  public void startNewGame() {
    board = new int[boardSize][boardSize];
    openSpots = boardSize * boardSize;
    populateRandomPiece();
    populateRandomPiece();
    score = 0;
  }

  private void populateRandomPiece() {
    if (openSpots == 0) {
      return;
    }
    int row = new Random().nextInt(boardSize);
    int col = new Random().nextInt(boardSize);
    if (board[row][col] != 0) {
      populateRandomPiece();
      return;
    }
    board[row][col] = (new Random().nextInt(10) < 8) ? 2 : 4;
    openSpots--;
  }

  /**
   * Determines if the game is over or not.
   * @return True if the user cannot move.
   */
  public boolean isGameOver() {
    for (int i = 0; i < boardSize; i++) {
      for (int j = 0; j < boardSize; j++) {
        if (board[i][j] == 0) {
          return false;
        }
        if (i + 1 < boardSize && board[i + 1][j] == board[i][j]) {
          return false;
        }
        if (j + 1 < boardSize && board[i][j + 1] == board[i][j]) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Get the score of the game.
   * @return The score of the current game.
   */
  public int getScore() {
    return score;
  }

  /**
   * Get the board.
   * @return A matrix which is the board.
   */
  public int[][] getBoard() {
    return board;
  }

  void setBoard(int[][] board) {
    this.board = board;
  }

  /**
   * Move down.
   */
  public void moveDown() {
    for (int row = boardSize - 2; row >= 0; row--) {
      for (int col = 0; col < boardSize; col++) {
        int val = board[row][col];
        if (val != 0) {
          int nextRow = row + 1;
          while (nextRow < boardSize && board[nextRow][col] == 0) {
            nextRow++;
          }
          if (nextRow < boardSize && board[nextRow][col] == val) {
            board[nextRow][col] += val;
            board[row][col] = 0;
            score += val * 2;
            openSpots++;
          } else {
            board[row][col] = 0;
            board[nextRow - 1][col] = val;
          }
        }
      }
    }
    populateRandomPiece();
  }

  /**
   * Move up.
   */
  public void moveUp() {
    for (int row = 1; row < boardSize; row++) {
      for (int col = 0; col < boardSize; col++) {
        int val = board[row][col];
        if (val != 0) {
          int prevRow = row - 1;
          while (prevRow >= 0 && board[prevRow][col] == 0) {
            prevRow--;
          }
          if (prevRow >= 0 && board[prevRow][col] == val) {
            board[prevRow][col] += val;
            board[row][col] = 0;
            score += val * 2;
            openSpots++;
          } else {
            board[row][col] = 0;
            board[prevRow + 1][col] = val;
          }
        }
      }
    }
    populateRandomPiece();
  }

  /**
   * Move left.
   */
  public void moveLeft() {
    for (int row = 0; row < boardSize; row++) {
      for (int col = 1; col < boardSize; col++) {
        int val = board[row][col];
        if (val != 0) {
          int prevCol = col - 1;
          while (prevCol >= 0 && board[row][prevCol] == 0) {
            prevCol--;
          }
          if (prevCol >= 0 && board[row][prevCol] == val) {
            board[row][prevCol] += val;
            board[row][col] = 0;
            score += val * 2;
            openSpots++;
          } else {
            board[row][col] = 0;
            board[row][prevCol + 1] = val;
          }
        }
      }
    }
    populateRandomPiece();
  }

  /**
   * Move right.
   */
  public void moveRight() {
    for (int row = 0; row < boardSize; row++) {
      for (int col = boardSize - 2; col >= 0; col--) {
        int val = board[row][col];
        if (val != 0) {
          int nextCol = col + 1;
          while (nextCol < boardSize && board[row][nextCol] == 0) {
            nextCol++;
          }
          if (nextCol < boardSize && board[row][nextCol] == val) {
            board[row][nextCol] += val;
            board[row][col] = 0;
            score += val * 2;
            openSpots++;
          } else {
            board[row][col] = 0;
            board[row][nextCol - 1] = val;
          }
        }
      }
    }
    populateRandomPiece();
  }

  /**
   * Print the game.
   */
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Score: " + getScore() + "\n");
    for (int[] row : board) {
      stringBuilder.append("[");
      for (int num : row) {
        stringBuilder.append(String.format("% 10d", num));
        stringBuilder.append(",");
      }
      stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      stringBuilder.append("]\n");
    }
    return stringBuilder.toString();
  }
}
