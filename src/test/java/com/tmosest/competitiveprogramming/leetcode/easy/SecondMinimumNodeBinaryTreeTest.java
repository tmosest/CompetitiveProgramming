package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("binaryTree")
@DisplayName("LeetCode: 671. Second Minimum Node In a Binary Tree")
class SecondMinimumNodeBinaryTreeTest {
	/* Write code here. */

  SecondMinimumNodeBinaryTree secondMinimumNodeBinaryTree = new SecondMinimumNodeBinaryTree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(1);

    Assertions.assertEquals(1, secondMinimumNodeBinaryTree.findSecondMinimumValue(root));
  }


}
