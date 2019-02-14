package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("binaryTree")
@DisplayName("LeetCode: 617. Merge Two Binary Trees")
public class MergeTwoBinaryTreesTest {

  MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();

  private void helper(TreeNode nodeOne, TreeNode nodeTwo) {
    if (nodeOne == null && nodeTwo == null) {
      Assertions.assertTrue(true);
    } else if (nodeOne == null || nodeTwo == null) {
      Assertions.assertTrue(false);
    } else {
      Assertions.assertEquals(nodeOne.val, nodeTwo.val);
      helper(nodeOne.left, nodeTwo.left);
      helper(nodeOne.right, nodeTwo.right);
    }
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode rootOne = new TreeNode(1);
    rootOne.left = new TreeNode(2);
    TreeNode rootTwo = new TreeNode(2);
    rootTwo.right = new TreeNode(3);

    TreeNode expected = new TreeNode(3);
    expected.left = rootOne.left;
    expected.right = rootTwo.right;

    TreeNode actual = mergeTwoBinaryTrees.mergeTrees(rootOne, rootTwo);
    helper(expected, actual);
  }
}
