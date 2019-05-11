package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@DisplayName("LeetCode: 663. Equal Tree Partition")
public class EqualTreePartitionTest {

  EqualTreePartition equalTreePartition = new EqualTreePartition();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(10);
    root.right = new TreeNode(10);
    root.right.left = new TreeNode(2);
    root.right.right = new TreeNode(3);

    Assertions.assertTrue(equalTreePartition.checkEqualTree(root));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(10);
    root.right.left = new TreeNode(2);
    root.right.right = new TreeNode(20);

    Assertions.assertFalse(equalTreePartition.checkEqualTree(root));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(1);
    root.right = new TreeNode(-1);

    Assertions.assertFalse(equalTreePartition.checkEqualTree(root));
  }
}
