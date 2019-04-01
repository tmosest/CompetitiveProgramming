package com.tmosest.competitiveprogramming.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class TheMazeTwo {

  /**
   * Get the shortest path for the ball.
   * Once ball rolls in a direction it doesn't stop till it hits a wall.
   * @param maze The maze with 1'point as walls.
   * @param start The start location.
   * @param destination The end location.
   * @return -1 if no path is found.
   */
  public int shortestDistance(int[][] maze, int[] start, int[] destination) {
    boolean[][] visited = new boolean[maze.length][maze[0].length];
    int[][] distances = new int[maze.length][maze[0].length];
    for (int i = 0; i < maze.length; i++) {
      for (int j = 0; j < maze[0].length; j++) {
        distances[i][j] = Integer.MAX_VALUE;
      }
    }
    int[][] dirs = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    Queue<int[]> queue = new LinkedList<>();
    queue.add(start);
    visited[start[0]][start[1]] = true;
    distances[start[0]][start[1]] = 0;
    while (!queue.isEmpty()) {
      int[] point = queue.remove();
      int distance = distances[point[0]][point[1]];
      for (int[] dir: dirs) {
        int row = point[0] + dir[0];
        int col = point[1] + dir[1];
        int steps = 0;
        while (row >= 0
            && col >= 0
            && row < maze.length
            && col < maze[0].length
            && maze[row][col] == 0) {
          row += dir[0];
          col += dir[1];
          steps++;
        }
        if (!visited[row - dir[0]][col - dir[1]]) {
          queue.add(new int[] {row - dir[0], col - dir[1]});
          visited[row - dir[0]][col - dir[1]] = true;
          int curr = distances[row - dir[0]][col - dir[1]];
          distances[row - dir[0]][col - dir[1]] = Math.min(curr, distance + steps);
        }
      }
    }
    return distances[destination[0]][destination[1]] == Integer.MAX_VALUE ? -1 : distances[destination[0]][destination[1]];
  }
}
