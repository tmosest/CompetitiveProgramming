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

  private Codec codec = new Codec();

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
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(10);
    root.right = new TreeNode(10);
    root.right.left = new TreeNode(2);
    root.right.right = new TreeNode(3);

    String expected = "[5,10,10,null,null,2,3]";
    TreeNode actual = codec.deserialize(expected);
    helper(root, actual);
    Assertions.assertEquals(expected, codec.serialize(root));
  }
}
