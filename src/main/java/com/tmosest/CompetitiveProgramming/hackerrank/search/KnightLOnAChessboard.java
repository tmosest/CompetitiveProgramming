package com.tmosest.CompetitiveProgramming.hackerrank.search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KnightLOnAChessboard {

  public static boolean debugMode = false;

  private static int size;

  private static class Node {
    public int x;
    public int y;
    public int t;

    public Node(int x, int y, int t) {
      this.x = x;
      this.y = y;
      this.t = t;
    }
  }

  private static int bfs(int i, int j) {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(new Node(0, 0, 0));
    if (queue.size() == 0)
      return 0;
    boolean[][] visited = new boolean[size][size];
    while (queue.size() != 0) {
      Node n = queue.remove();
      int x = n.x;
      int y = n.y;
      int t = n.t;
      if (x - i >= 0) {
        if (y - j >= 0) {
          addPoint(x - i, y - j, t + 1, queue, visited);
        }
        if (y + j < size) {
          addPoint(x - i, y + i, t + 1, queue, visited);
        }
      }
      if (x + i < size) {
        if (y - j >= 0) {
          addPoint(x + i, y - j, t + 1, queue, visited);
        }
        if (y + j < size) {
          if (x + i == size - 1 && y + j == size - 1)
            return t + 1;
          addPoint(x + i, y + j, t + 1, queue, visited);
        }
      }
      if (x - j >= 0) {
        if (y - i >= 0) {
          addPoint(x - j, y - i, t + 1, queue, visited);
        }
        if (y + i < size) {
          addPoint(x - j, y + i, t + 1, queue, visited);
        }
      }
      if (x + j < size) {
        if (y - i >= 0) {
          addPoint(x + j, y - i, t + 1, queue, visited);
        }
        if (y + i < size) {
          if (x + j == size - 1 && y + i == size - 1)
            return t + 1;
          addPoint(x + j, y + i, t + 1, queue, visited);
        }
      }
    }
    return -1;
  }

  private static void addPoint(int x, int y, int t, Queue<Node> queue, boolean[][] visited) {
    if (visited[x][y])
      return;
    queue.add(new Node(x, y, t));
    visited[x][y] = true;
  }

  public static int[][] solve() {
    Scanner in = new Scanner(System.in);
    size = in.nextInt();
    in.close();

    if (debugMode)
      System.out.println("Looking at board size: " + size);

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
    
    if(debugMode)
      printMoves(movesBoard);
    
    return movesBoard;
  }
  
  private static void printMoves(int[][] matrix) {
    for(int i = 1; i < size; i++) {
      for(int j = 1; j < size; j++) {
        System.out.print(matrix[i - 1][j - 1] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printMoves(solve());
  }

}
