package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MinimumTimeToCollectAllApplesInTree {

  int minTime(int len, int[][] edges, List<Boolean> hasApple) {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    boolean[] visited = new boolean[len];
    for (int i = 0; i < len; i++) {
      graph.put(i, new ArrayList<>());
    }
    for (int[] edge : edges) {
      graph.get(edge[0]).add(edge[1]);
      graph.get(edge[1]).add(edge[0]);
    }
    return dfs(graph, hasApple, 0, visited);
  }

  private int dfs(Map<Integer, List<Integer>> graph, List<Boolean> hasApple, int node,
      boolean[] visited) {
    int nodeCount = 0;
    visited[node] = true;
    for (int child : graph.get(node)) {
      if (!visited[child]) {
        nodeCount += dfs(graph, hasApple, child, visited);
      }
    }
    return (nodeCount != 0 || hasApple.get(node)) ? (node == 0 ? nodeCount : nodeCount + 2) : 0;
  }
}
