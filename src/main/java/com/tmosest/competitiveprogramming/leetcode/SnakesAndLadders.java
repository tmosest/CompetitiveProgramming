package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SnakesAndLadders {

  private class Node {
    int id;
    int val;
    List<Node> adjList;

    public Node(int id, int val) {
      this.id = id;
      this.val = val;
      adjList = new ArrayList<>();
    }
  }

  /**
   * Determine the minimum number of rolls needed to win snakes and ladders.
   * @param board The board.
   * @return The minimum number of rolls.
   */
  public int snakesAndLadders(int[][] board) {
    int totalNodes = board.length * board[0].length;
    List<Node> nodes = new ArrayList<>();
    int index = 1;
    int row = board.length - 1;
    int col = 0;
    boolean right = true;
    while (index <= totalNodes) {
      nodes.add(new Node(index, board[row][col]));
      if (right) {
        col++;
        if (col >= board[0].length) {
          right = false;
          col--;
          row--;
        }
      } else {
        col--;
        if (col < 0) {
          right = true;
          row--;
          col++;
        }
      }
      index++;
    }
    index = 1;
    while (index <= totalNodes) {
      Node node = nodes.get(index - 1);
      if (node.val == -1) {
        for (int i = index + 1; i <= Math.min(index + 6, totalNodes); i++) {
          Node next = nodes.get(i - 1);
          if (next.val == -1) {
            node.adjList.add(next);
          } else {
            node.adjList.add(nodes.get(next.val - 1));
          }
        }
      }
      index++;
    }
    boolean[] visited = new boolean[totalNodes];
    int[] distances = new int[totalNodes];
    for (int i = 0; i < distances.length; i++) {
      distances[i] = Integer.MAX_VALUE;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.add(nodes.get(0));
    visited[0] = true;
    distances[0] = 0;
    while (!queue.isEmpty()) {
      Node root = queue.poll();
      int distance = distances[root.id - 1];
      for (Node node : root.adjList) {
        if (!visited[node.id - 1]) {
          queue.add(node);
          distances[node.id - 1] = Math.min(distance + 1, distances[node.id - 1]);
        }
      }
      visited[root.id - 1] = true;
    }
    if (distances[totalNodes - 1] == Integer.MAX_VALUE) {
      return -1;
    }
    return distances[totalNodes - 1];
  }
}
