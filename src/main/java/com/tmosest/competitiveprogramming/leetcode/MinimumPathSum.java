package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumPathSum {

  /**
   * Determine the minimum cost from the top left to bottom right.
   * Can only move down or right at any point.
   * @param grid The grid of values.
   * @return The minimum sum of the path.
   */
  public int minPathSum(int[][] grid) {
    ArrayList<Node> nodes = new ArrayList<>();
    int index = 0;
    for (int[] row : grid) {
      for (int val : row) {
        nodes.add(new Node(index++, val));
      }
    }
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        Node node = nodes.get(getId(i, j, grid[0].length));
        if (i + 1 < grid.length) {
          node.neighbors.add(nodes.get(getId(i + 1, j, grid[0].length)));
        }
        if (j + 1 < grid[0].length) {
          node.neighbors.add(nodes.get(getId(i, j + 1, grid[0].length)));
        }
      }
    }
    boolean[] visited = new boolean[nodes.size()];
    int[] distances = new int[nodes.size()];
    for (int i = 0; i < distances.length; i++) {
      distances[i] = Integer.MAX_VALUE;
    }
    Queue<Node> queue = new LinkedList<>();
    Node root = nodes.get(0);
    distances[0] = root.val;
    queue.add(root);
    while (!queue.isEmpty()) {
      root = queue.poll();
      int distance = distances[root.id];
      if (!visited[root.id]) {
        for (Node node : root.neighbors) {
          distances[node.id] = Math.min(distances[node .id], distance + node.val);
          queue.add(node);
        }
        visited[root.id] = true;
      }
    }
    return distances[getId(grid.length - 1, grid[0].length - 1, grid[0].length)];
  }

  private int getId(int row, int col, int cols) {
    return row * cols + col;
  }

  private class Node {
    int id;
    int val;
    ArrayList<Node> neighbors;

    private Node(int id, int val) {
      this.id = id;
      this.val = val;
      neighbors = new ArrayList<>();
    }
  }
}
