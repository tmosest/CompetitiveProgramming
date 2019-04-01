package com.tmosest.competitiveprogramming.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class TheMaze {

  /**
   * Determine if a rolling ball has a path to the endpoint.
   * Once ball rolls in a direction it doesn't stop till it hits a wall.
   * @param maze The maze with 1'point as walls.
   * @param start The start location.
   * @param destination The end location.
   * @return True if the ball can get to the end.
   */
  public boolean hasPath(int[][] maze, int[] start, int[] destination) {
    boolean[][] visited = new boolean[maze.length][maze[0].length];
    int[][] dirs = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    Queue<int[]> queue = new LinkedList<>();
    queue.add(start);
    visited[start[0]][start[1]] = true;
    while (!queue.isEmpty()) {
      int[] point = queue.remove();
      if (point[0] == destination[0] && point[1] == destination[1]) {
        return true;
      }
      for (int[] dir: dirs) {
        int row = point[0] + dir[0];
        int col = point[1] + dir[1];
        while (row >= 0
            && col >= 0
            && row < maze.length
            && col < maze[0].length
            && maze[row][col] == 0) {
          row += dir[0];
          col += dir[1];
        }
        if (!visited[row - dir[0]][col - dir[1]]) {
          queue.add(new int[] {row - dir[0], col - dir[1]});
          visited[row - dir[0]][col - dir[1]] = true;
        }
      }
    }
    return false;
  }
}
