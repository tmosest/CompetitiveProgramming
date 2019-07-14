package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 958. Check Completeness of a Binary Tree")
class CheckCompletenessOfBinaryTreeTest {

  private CheckCompletenessOfBinaryTree checkCompletenessOfBinaryTree = new CheckCompletenessOfBinaryTree();
  private Codec codec = new Codec();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(
        checkCompletenessOfBinaryTree.isCompleteTree(codec.deserialize("[1,2,3,4,5,6]")));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(
        checkCompletenessOfBinaryTree.isCompleteTree(codec.deserialize("[1,2,3,4,5,null,7]")));
  }
}
