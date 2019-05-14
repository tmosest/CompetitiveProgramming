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

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(10);
    root.right = new TreeNode(10);
    root.right.left = new TreeNode(2);
    root.right.right = new TreeNode(3);

    String actualString = codec.serialize(root);
    String expected = "[5,10,10,null,null,2,3]";
    Assertions.assertEquals(expected, actualString);

    TreeNode actual = codec.deserialize(expected);
    Assertions.assertTrue(root.equals(actual));
  }
}
