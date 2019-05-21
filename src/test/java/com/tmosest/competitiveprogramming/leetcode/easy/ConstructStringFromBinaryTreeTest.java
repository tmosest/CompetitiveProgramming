package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("binaryTree")
@DisplayName("LeetCode: 606. Construct String from Binary Tree")
class ConstructStringFromBinaryTreeTest {
	/* Write code here. */

  ConstructStringFromBinaryTree constructStringFromBinaryTree = new ConstructStringFromBinaryTree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.right = new TreeNode(3);

    Assertions.assertEquals("1(2(4))(3)", constructStringFromBinaryTree.tree2str(root));
  }


}
