package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("binarySearchTree")
@DisplayName("LeetCode: 543. Diameter of Binary Tree")
public class DiameterOfBinaryTreeTest {

  DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);

    Assertions.assertEquals(3, diameterOfBinaryTree.diameterOfBinaryTree(root));
  }
}
