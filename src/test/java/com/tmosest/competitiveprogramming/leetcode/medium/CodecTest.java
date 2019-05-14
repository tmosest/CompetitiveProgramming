package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("binaryTree")
@Tag("medium")
@DisplayName("LeetCode: 449. Serialize and Deserialize BST")
class CodecTest {
	/* Write code here. */

  Codec codec = new Codec();

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
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(1);
    root.right = new TreeNode(2);
    String expected = "0,1,null,null,2,null,null";
    Assertions.assertEquals(expected, codec.serialize(root));

    TreeNode actualTree = codec.deserialize(expected);
    helper(root, actualTree);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(3);
    root.right = new TreeNode(2);
    String expected = "0,1,3,null,null,null,2,null,null";
    Assertions.assertEquals(expected, codec.serialize(root));

    TreeNode actualTree = codec.deserialize(expected);
    helper(root, actualTree);
  }


}
