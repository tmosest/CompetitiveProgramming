package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class RottingOranges {
  int[] dr = new int[]{-1, 0, 1, 0};
  int[] dc = new int[]{0, -1, 0, 1};

  /**
   * Determine rotting oranges.
   * @param grid The grid of oranges.
   * @return The number that will rot.
   */
  public int orangesRotting(int[][] grid) {
    int rows = grid.length;
    int cols = grid[0].length;

    Queue<Integer> queue = new ArrayDeque<>();
    Map<Integer, Integer> depth = new HashMap<>();
    for (int row = 0; row < rows; ++row) {
      for (int col = 0; col < cols; ++col) {
        if (grid[row][col] == 2) {
          int code = row * cols + col;
          queue.add(code);
          depth.put(code, 0);
        }
      }
    }

    int ans = 0;
    while (!queue.isEmpty()) {
      int code = queue.remove();
      int row = code / cols;
      int col = code % cols;
      for (int k = 0; k < 4; ++k) {
        int nr = row + dr[k];
        int nc = col + dc[k];
        if (0 <= nr && nr < rows && 0 <= nc && nc < cols && grid[nr][nc] == 1) {
          grid[nr][nc] = 2;
          int ncode = nr * cols + nc;
          queue.add(ncode);
          depth.put(ncode, depth.get(code) + 1);
          ans = depth.get(ncode);
        }
      }
    }

    for (int[] row: grid) {
      for (int v : row) {
        if (v == 1) {
          return -1;
        }
      }
    }
    return ans;

  }
}
