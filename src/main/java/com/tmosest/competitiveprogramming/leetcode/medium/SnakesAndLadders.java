package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class SnakesAndLadders {
  /* Write code here. */

  /**
   * Determine the minimum number of rolls needed to win snakes and ladders.
   *
   * @param board The board.
   * @return The minimum number of rolls.
   */
  public int snakesAndLadders(int[][] board) {
    int size = board.length;

    Map<Integer, Integer> dist = new HashMap<>();
    dist.put(1, 0);

    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);

    while (!queue.isEmpty()) {
      int temp = queue.remove();
      if (temp == size * size) {
        return dist.get(temp);
      }

      for (int s2 = temp + 1; s2 <= Math.min(temp + 6, size * size); ++s2) {
        int rc = get(s2, size);
        int row = rc / size;
        int col = rc % size;
        int s2Final = board[row][col] == -1 ? s2 : board[row][col];
        if (!dist.containsKey(s2Final)) {
          dist.put(s2Final, dist.get(temp) + 1);
          queue.add(s2Final);
        }
      }
    }
    return -1;
  }

  private int get(int temp, int size) {
    // Given a square num temp, return board coordinates (row, col) as row*size + col
    int quot = (temp - 1) / size;
    int rem = (temp - 1) % size;
    int row = size - 1 - quot;
    int col = row % 2 != size % 2 ? rem : size - 1 - rem;
    return row * size + col;
  }


}
