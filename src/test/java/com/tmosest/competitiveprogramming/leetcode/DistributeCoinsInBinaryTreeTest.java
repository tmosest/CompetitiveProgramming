package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@DisplayName("LeetCode: 979. Distribute Coins in Binary Tree")
class DistributeCoinsInBinaryTreeTest {

  private DistributeCoinsInBinaryTree distributeCoinsInBinaryTree = new DistributeCoinsInBinaryTree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(0);
    root.right = new TreeNode(0);

    Assertions.assertEquals(2, distributeCoinsInBinaryTree.distributeCoins(root));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(2);

    Assertions.assertEquals(2, distributeCoinsInBinaryTree.distributeCoins(root));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(3);
    root.right = new TreeNode(0);

    Assertions.assertEquals(3, distributeCoinsInBinaryTree.distributeCoins(root));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(2);

    Assertions.assertEquals(2, distributeCoinsInBinaryTree.distributeCoins(root));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(0);
    root.left.right = new TreeNode(3);

    Assertions.assertEquals(4, distributeCoinsInBinaryTree.distributeCoins(root));
  }
}
