package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@DisplayName("LeetCode: 742. Closest Leaf in a Binary Tree")
public class ClosestLeafInBinaryTreeTest {

  ClosestLeafInBinaryTree closestLeafInBinaryTree = new ClosestLeafInBinaryTree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.right = new TreeNode(2);

    Assertions.assertNotEquals(1, closestLeafInBinaryTree.findClosestLeaf(root, 1));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(4);
    root.right.right.right = new TreeNode(5);
    root.right.right.right.right = new TreeNode(6);

    Assertions.assertEquals(3, closestLeafInBinaryTree.findClosestLeaf(root, 2));
  }
}
