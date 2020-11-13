package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.PriorityQueue;

class PathWithMinimumEffort {

  private int[][] dirs = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

  int minimumEffortPath(int[][] heights) {
    int rows = heights.length;
    int cols = heights[0].length;
    boolean[][] visited = new boolean[rows][cols];
    PriorityQueue<int[]> queue = new PriorityQueue<>((one, two) -> one[0] - two[0]);
    queue.offer(new int[]{0, 0, 0});
    visited[0][0] = true;
    while (!queue.isEmpty()) {
      int[] cell = queue.poll();
      if (cell[1] == rows - 1 && cell[2] == cols - 1) {
        return cell[0];
      }
      visited[cell[1]][cell[2]] = true;
      for (int[] dir : dirs) {
        int row = cell[1] + dir[0];
        int col = cell[2] + dir[1];
        if (row < 0 || row > rows - 1 || col < 0 || col > cols - 1 || visited[row][col]) {
          continue;
        }
        int maxDiff = Math.max(cell[0], Math.abs(heights[row][col]
            - heights[cell[1]][cell[2]]));
        queue.offer(new int[]{maxDiff, row, col});
      }
    }
    return -1;
  }
}
