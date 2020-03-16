package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1008. Construct Binary Search Tree from Preorder Traversal")
class ConstructBinarySearchTreeFromPreorderTraversalTest {

  private ConstructBinarySearchTreeFromPreorderTraversal constructBinaryTreeFromPreorderTraversal =
      new ConstructBinarySearchTreeFromPreorderTraversal();

  @Test
  void testCase0() {
    int[] input = {8,5,1,7,10,12};
    constructBinaryTreeFromPreorderTraversal.bstFromPreorder(input);
  }
}
