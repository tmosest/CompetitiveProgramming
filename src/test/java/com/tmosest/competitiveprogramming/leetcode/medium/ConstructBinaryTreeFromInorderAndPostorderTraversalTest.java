package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 106. Construct Binary Tree from Inorder and Postorder Traversal")
class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

  private ConstructBinaryTreeFromInorderAndPostorderTraversal constructBinaryTreeFromInorderAndPostorderTraversal =
      new ConstructBinaryTreeFromInorderAndPostorderTraversal();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {1};
    Assertions.assertEquals(
        1,
        constructBinaryTreeFromInorderAndPostorderTraversal.buildTree(input, input).val
    );
  }
}
