package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class NumberOfConnectedComponentsInAnUndirectedGraph {

  /**
   * Get the number of connected components.
   *
   * @param nodes The number of nodes.
   * @param edges The number of edges.
   * @return The number of connected components.
   */
  int countComponents(int nodes, int[][] edges) {
    List<List<Integer>> adjacencyList = new ArrayList<>();
    // Add a list for every node.
    for (int i = 0; i < nodes; i++) {
      adjacencyList.add(new ArrayList<>());
    }
    // Convert all of the edges to entries in lists.
    for (int[] edge : edges) {
      adjacencyList.get(edge[0]).add(edge[1]);
      adjacencyList.get(edge[1]).add(edge[0]);
    }
    // Keep track of all the visited nodes.
    boolean[] visited = new boolean[nodes];
    int count = 0;
    for (int i = 0; i < nodes; i++) {
      if (visited[i]) {
        continue;
      }
      ++count;
      Stack<Integer> stack = new Stack<>();
      stack.push(i);
      while (!stack.isEmpty()) {
        int node = stack.pop();
        visited[node] = true;
        for (int neighbor : adjacencyList.get(node)) {
          if (!visited[neighbor]) {
            stack.push(neighbor);
          }
        }
      }
    }
    return count;
  }
}
