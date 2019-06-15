package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 323. Number of Connected Components in an Undirected Graph")
class NumberOfConnectedComponentsInAnUndirectedGraphTest {

  private NumberOfConnectedComponentsInAnUndirectedGraph numberOfConnectedComponentsInAnUndirectedGraph
      = new NumberOfConnectedComponentsInAnUndirectedGraph();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] edges = {{0, 1}, {1, 2}, {3, 4}};
    Assertions
        .assertEquals(2, numberOfConnectedComponentsInAnUndirectedGraph.countComponents(5, edges));
  }
}
