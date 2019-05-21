package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@DisplayName("LeetCode: 114. Flatten Binary Tree to Linked List")
class FlattenBinaryTreeToLinkedListTest {
	/* Write code here. */

  FlattenBinaryTreeToLinkedList flattenBinaryTreeToLinkedList = new FlattenBinaryTreeToLinkedList();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(5);
    root.right.right = new TreeNode(6);

    flattenBinaryTreeToLinkedList.flatten(root);

    int index = 1;
    while (root != null) {
      Assertions.assertEquals(null, root.left);
      Assertions.assertEquals(index++, root.val);
      root = root.right;
    }
  }


}
