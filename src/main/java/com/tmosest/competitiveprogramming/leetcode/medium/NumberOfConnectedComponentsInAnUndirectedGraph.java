package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.utils.graph.UtilGraph;

import java.util.Arrays;

class NumberOfConnectedComponentsInAnUndirectedGraph {

  /**
   * Get the number of connected components.
   *
   * @param nodes The number of nodes.
   * @param edges The number of edges.
   * @return The number of connected components.
   */
  int countComponents(int nodes, int[][] edges) {
    Integer[] values = new Integer[nodes];
    for (int i = 0; i < values.length; i++) {
      values[i] = i;
    }
    UtilGraph<Integer> graph = new UtilGraph<>(Arrays.asList(values), edges);
    return graph.countConnectedComponents();
  }
}
