package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1361. Validate Binary Tree Nodes")
class ValidateBinaryTreeNodesTest {

  private ValidateBinaryTreeNodes validateBinaryTreeNodes =
      new ValidateBinaryTreeNodes();

  @Test
  void testCase0() {
    int[] left = {1,-1,3,-1};
    int[] right = {2,3,-1,-1};
    Assertions.assertFalse(validateBinaryTreeNodes.validateBinaryTreeNodes(4, left, right));
  }
}
