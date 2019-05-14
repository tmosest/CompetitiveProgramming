package com.tmosest.competitiveprogramming.leetcode.medium;

class GameOfLife {
  /* Write code here. */

  private static int dieing = -1;
  private static int becomingAlive = 2;
  private static int dead = 0;
  private static int live = 1;
  private int[][] lifeBoard;
  private int row = 0;
  private int col = 0;

  /**
   * Game of life simulation.
   *
   * @param board The starting board.
   */
  public void gameOfLife(int[][] board) {
    lifeBoard = board;
    for (row = 0; row < lifeBoard.length; row++) {
      for (col = 0; col < lifeBoard[row].length; col++) {
        int neighborCount = neighborCount();
        if (neighborCount < 2) {
          if (lifeBoard[row][col] == live) {
            lifeBoard[row][col] = dieing;
          }
        } else if (neighborCount >= 2 && neighborCount <= 3) {
          if (lifeBoard[row][col] == live) {
            lifeBoard[row][col] = live;
          } else {
            if (neighborCount == 3 && lifeBoard[row][col] == dead) {
              lifeBoard[row][col] = becomingAlive;
            }
          }
        } else {
          if (lifeBoard[row][col] == live) {
            lifeBoard[row][col] = dieing;
          }
        }
      }
    }
    for (row = 0; row < lifeBoard.length; row++) {
      for (col = 0; col < lifeBoard[row].length; col++) {
        if (lifeBoard[row][col] == dieing) {
          lifeBoard[row][col] = dead;
        } else if (lifeBoard[row][col] == becomingAlive) {
          lifeBoard[row][col] = live;
        }
      }
    }
  }

  private int neighborCount() {
    int count = 0;
    if (row - 1 >= 0) {
      if (lifeBoard[row - 1][col] == dieing || lifeBoard[row - 1][col] == live) {
        ++count;
      }
      if (col - 1 >= 0) {
        if (lifeBoard[row - 1][col - 1] == dieing || lifeBoard[row - 1][col - 1] == live) {
          ++count;
        }
      }
      if (col + 1 < lifeBoard[0].length) {
        if (lifeBoard[row - 1][col + 1] == dieing || lifeBoard[row - 1][col + 1] == live) {
          ++count;
        }
      }
    }
    if (row + 1 < lifeBoard.length) {
      if (lifeBoard[row + 1][col] == dieing || lifeBoard[row + 1][col] == live) {
        ++count;
      }
      if (col - 1 >= 0) {
        if (lifeBoard[row + 1][col - 1] == dieing || lifeBoard[row + 1][col - 1] == live) {
          ++count;
        }
      }
      if (col + 1 < lifeBoard[0].length) {
        if (lifeBoard[row + 1][col + 1] == dieing || lifeBoard[row + 1][col + 1] == live) {
          ++count;
        }
      }
    }
    if (col - 1 >= 0) {
      if (lifeBoard[row][col - 1] == dieing || lifeBoard[row][col - 1] == live) {
        ++count;
      }
    }
    if (col + 1 < lifeBoard[0].length) {
      if (lifeBoard[row][col + 1] == dieing || lifeBoard[row][col + 1] == live) {
        ++count;
      }
    }
    return count;
  }


}
