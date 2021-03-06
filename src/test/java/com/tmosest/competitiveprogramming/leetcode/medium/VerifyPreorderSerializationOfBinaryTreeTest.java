package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 331. Verify Preorder Serialization of a Binary Tree")
class VerifyPreorderSerializationOfBinaryTreeTest {

  private VerifyPreorderSerializationOfBinaryTree verifyPreorderSerializationOfBinaryTree = new VerifyPreorderSerializationOfBinaryTree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(verifyPreorderSerializationOfBinaryTree.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
  }
}
