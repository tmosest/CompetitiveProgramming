package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

class WallsAndGates {
  /* Write code here. */

  public static int INF = Integer.MAX_VALUE;
  private static int GATE = 0;
  private static int BLOCK = -1;

  /**
   * Determine the min distance from gates to rooms.
   *
   * @param rooms A matrix of rooms.
   */
  public void wallsAndGates(int[][] rooms) {
    for (int i = 0; i < rooms.length; i++) {
      for (int j = 0; j < rooms[0].length; j++) {
        if (rooms[i][j] == GATE) {
          bfs(rooms, i, j);
        }
      }
    }
  }

  private void bfs(int[][] rooms, int row, int col) {
    boolean[][] visited = new boolean[rooms.length][rooms[0].length];
    Queue<Pair> queue = new LinkedList<>();
    queue.add(new Pair(row, col, 0));
    while (!queue.isEmpty()) {
      Pair root = queue.poll();
      int dist = root.dist;
      row = root.row;
      col = root.col;
      if (!visited[row][col]) {
        if (row - 1 >= 0
            && rooms[row - 1][col] != BLOCK
            && dist + 1 < rooms[row - 1][col]) {
          rooms[row - 1][col] = dist + 1;
          queue.add(new Pair(row - 1, col, dist + 1));
        }
        if (row + 1 < rooms.length
            && rooms[row + 1][col] != BLOCK
            && dist + 1 < rooms[row + 1][col]) {
          rooms[row + 1][col] = dist + 1;
          queue.add(new Pair(row + 1, col, dist + 1));
        }
        if (col - 1 >= 0
            && rooms[row][col - 1] != BLOCK
            && dist + 1 < rooms[row][col - 1]) {
          rooms[row][col - 1] = dist + 1;
          queue.add(new Pair(row, col - 1, dist + 1));
        }
        if (col + 1 < rooms[0].length
            && rooms[row][col + 1] != BLOCK
            && dist + 1 < rooms[row][col + 1]) {
          rooms[row][col + 1] = dist + 1;
          queue.add(new Pair(row, col + 1, dist + 1));
        }
        visited[row][col] = true;
      }
    }
  }

  private class Pair {

    int row;
    int col;
    int dist;

    private Pair(int row, int col, int dist) {
      this.row = row;
      this.col = col;
      this.dist = dist;
    }
  }


}
