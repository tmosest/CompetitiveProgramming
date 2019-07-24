package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 863. All Nodes Distance K in Binary Tree")
class AllNodesDistanceInBinaryTreeTest {

  private AllNodesDistanceInBinaryTree allNodesDistanceInBinaryTree = new AllNodesDistanceInBinaryTree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    allNodesDistanceInBinaryTree.distanceK(new TreeNode(1), new TreeNode(1), 0);
  }
}
