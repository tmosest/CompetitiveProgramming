package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 105. Construct Binary Tree from Preorder and Inorder Traversal")
class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

  private ConstructBinaryTreeFromPreorderAndInorderTraversal constructBinaryTreeFromPreorderAndInorderTraversal =
      new ConstructBinaryTreeFromPreorderAndInorderTraversal();

  @Test
  void testCase0() {
    int[] preorder = {3,9,20,15,7};
    int[] inorder = {9,3,15,20,7};
    constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);
  }
}
