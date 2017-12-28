package com.tmosest.competitiveprogramming.hackerrank.search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KnightLOnAChessboard {

  public static boolean debugMode = false;

  private static int size;

  private static int bfs(int row, int column) {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(new Node(0, 0, 0));
    if (queue.size() == 0) {
      return 0;
    }
    boolean[][] visited = new boolean[size][size];
    while (queue.size() != 0) {
      Node node = queue.remove();
      int xcord = node.xcord;
      int ycord = node.ycord;
      int time = node.time;
      if (xcord - row >= 0) {
        if (ycord - column >= 0) {
          addPoint(xcord - row, ycord - column, time + 1, queue, visited);
        }
        if (ycord + row < size) {
          addPoint(xcord - row, ycord + row, time + 1, queue, visited);
        }
      }
      if (xcord + row < size) {
        if (ycord - column >= 0) {
          addPoint(xcord + row, ycord - column, time + 1, queue, visited);
        }
        if (ycord + column < size) {
          if (xcord + row == size - 1 && ycord + column == size - 1) {
            return time + 1;
          }
          addPoint(xcord + row, ycord + column, time + 1, queue, visited);
        }
      }
      if (xcord - column >= 0) {
        if (ycord - row >= 0) {
          addPoint(xcord - column, ycord - row, time + 1, queue, visited);
        }
        if (ycord + row < size) {
          addPoint(xcord - column, ycord + row, time + 1, queue, visited);
        }
      }
      if (xcord + column < size) {
        if (ycord - row >= 0) {
          addPoint(xcord + column, ycord - row, time + 1, queue, visited);
        }
        if (ycord + row < size) {
          if (xcord + column == size - 1 && ycord + row == size - 1) {
            return time + 1;
          }
          addPoint(xcord + column, ycord + row, time + 1, queue, visited);
        }
      }
    }
    return -1;
  }

  private static void addPoint(int xcord, int ycord, int time, Queue<Node> queue,
      boolean[][] visited) {
    if (visited[xcord][ycord]) {
      return;
    }
    queue.add(new Node(xcord, ycord, time));
    visited[xcord][ycord] = true;
  }

  /**
   * Function to take in inputs and return possible knight moves.
   *
   * @return Return matrix of possible moves.
   */
  public static int[][] solve() {
    Scanner in = new Scanner(System.in);
    size = in.nextInt();
    in.close();

    if (debugMode) {
      System.out.println("Looking at board size: " + size);
    }

    int[][] movesBoard = new int[size - 1][size - 1];

    for (int i = 1; i < size; i++) {
      for (int j = 1; j < size; j++) {
        if (j >= i) {
          movesBoard[i - 1][j - 1] = bfs(i, j);
        } else {
          movesBoard[i - 1][j - 1] = movesBoard[j - 1][i - 1];
        }
      }
    }

    if (debugMode) {
      printMoves(movesBoard);
    }

    return movesBoard;
  }

  private static void printMoves(int[][] matrix) {
    for (int i = 1; i < size; i++) {
      for (int j = 1; j < size; j++) {
        System.out.print(matrix[i - 1][j - 1] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printMoves(solve());
  }

  private static class Node {

    public int xcord;
    public int ycord;
    public int time;

    public Node(int xcord, int ycord, int time) {
      this.xcord = xcord;
      this.ycord = ycord;
      this.time = time;
    }
  }

}
