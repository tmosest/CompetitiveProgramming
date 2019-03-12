package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("binaryTree")
@DisplayName("LeetCode: 993. Cousins in Binary Tree")
public class CousinsInBinaryTreeTest {

  CousinsInBinaryTree cousinsInBinaryTree = new CousinsInBinaryTree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(3);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    Assertions.assertFalse(cousinsInBinaryTree.isCousins(root, 4, 3));
  }
}
