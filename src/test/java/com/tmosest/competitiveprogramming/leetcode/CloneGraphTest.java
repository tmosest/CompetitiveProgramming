package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("depthFirstSearch")
@Tag("graph")
@Tag("medium")
@DisplayName("LeetCode: 54. Spiral Matrix")
public class CloneGraphTest {

  CloneGraph cloneGraph = new CloneGraph();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    CloneGraph.Node root = new CloneGraph.Node(1, new ArrayList<>());
    CloneGraph.Node actual = cloneGraph.cloneGraph(root);
    Assertions.assertNotEquals(root, actual);
    Assertions.assertEquals(root.val, actual.val);
    Assertions.assertEquals(root.neighbors, actual.neighbors);
  }
}
