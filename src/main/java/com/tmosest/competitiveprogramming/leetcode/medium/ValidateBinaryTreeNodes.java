package com.tmosest.competitiveprogramming.leetcode.medium;

class ValidateBinaryTreeNodes {

  boolean validateBinaryTreeNodes(int num, int[] leftChild, int[] rightChild) {

    int[] indegree = new int[num];

    // Count the indegrees for all the nodes.
    for (int i = 0; i < num; i++) {
      if (leftChild[i] != -1) {
        indegree[leftChild[i]]++;
      }
      if (rightChild[i] != -1) {
        indegree[rightChild[i]]++;
      }
    }

    // Start verification
    int zeroIndegreeNodes = 0;
    int rootNode = 0;
    for (int i = 0; i < num; i++) {
      if (indegree[i] == 0) {
        zeroIndegreeNodes++;
        rootNode = i;
      }

      // All nodes except root node should have indegree = 1
      if (indegree[i] > 1 || zeroIndegreeNodes > 1) {
        return false;
      }
    }

    // There should be exactly 1 node with indegree = 0 and that should be the root node.
    if (zeroIndegreeNodes == 0) {
      return false;
    }

    // Do a dfs and check if there is only one component.
    // If there are multiple components, some nodes would be marked as unvisited.
    boolean[] visited = new boolean[num];
    dfs(rootNode, leftChild, rightChild, visited);
    for (int i = 0; i < num; i++) {
      if (!visited[i]) {
        return false;
      }
    }

    return true;
  }

  private void dfs(int root, int[] left, int[] right, boolean[] visited) {
    visited[root] = true;
    if (left[root] != -1) {
      dfs(left[root], left, right, visited);
    }
    if (right[root] != -1) {
      dfs(right[root], left, right, visited);
    }
  }
}
