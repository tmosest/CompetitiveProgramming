package com.tmosest.competitiveprogramming.leetcode.medium;

class UniqueBinarySearchTrees {

  /**
   * Determine the number of binary trees that can be made.
   *
   * @param size The number of nodes.
   * @return The number of unique trees.
   */
  int numTrees(int size) {
    int[] graph = new int[size + 1];
    graph[0] = 1;
    graph[1] = 1;

    for (int i = 2; i <= size; ++i) {
      for (int j = 1; j <= i; ++j) {
        graph[i] += graph[j - 1] * graph[i - j];
      }
    }
    return graph[size];
  }
}
