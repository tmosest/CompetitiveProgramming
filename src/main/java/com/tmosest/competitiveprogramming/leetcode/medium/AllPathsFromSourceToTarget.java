package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class AllPathsFromSourceToTarget {
  /* Write code here. */

  /**
   * Determine all paths from source to destination in DAG.
   *
   * @param graph The graph.
   * @return A list of all the paths.
   */
  List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    return solve(graph, 0);
  }

  private List<List<Integer>> solve(int[][] graph, int node) {
    int length = graph.length;
    List<List<Integer>> ans = new ArrayList<>();
    if (node == length - 1) {
      List<Integer> path = new ArrayList<>();
      path.add(length - 1);
      ans.add(path);
      return ans;
    }

    for (int nei : graph[node]) {
      for (List<Integer> path : solve(graph, nei)) {
        path.add(0, node);
        ans.add(path);
      }
    }
    return ans;
  }


}
