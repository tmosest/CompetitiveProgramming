package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@DisplayName("LeetCode: 623. Add One Row to Tree")
class AddOneRowToTreeTest {

  private AddOneRowToTree addOneRowToTree = new AddOneRowToTree();

  private void treeEquals(TreeNode expected, TreeNode actual) {
    if (actual == null && expected == null) {
      Assertions.assertTrue(true);
      return;
    }
    if (actual == null || expected == null) {
      Assertions.assertTrue(false);
      return;
    }
    Assertions.assertEquals(expected.val, actual.val);
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(6);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(1);
    root.right.left = new TreeNode(5);

    TreeNode expected = new TreeNode(4);
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(2);
    root.left.left.left = new TreeNode(3);
    root.left.left.right = new TreeNode(1);
    root.right.right = new TreeNode(6);
    root.right.right.left = new TreeNode(5);

    TreeNode actual = addOneRowToTree.addOneRow(root, 1, 2);
    treeEquals(expected, actual);
  }
}
