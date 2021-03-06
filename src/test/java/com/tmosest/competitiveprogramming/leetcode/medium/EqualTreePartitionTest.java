package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@DisplayName("LeetCode: 663. Equal Tree Partition")
class EqualTreePartitionTest {
	/* Write code here. */

	private Codec codec = new Codec();
  private EqualTreePartition equalTreePartition = new EqualTreePartition();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = codec.deserialize("[5,10,10,null,null,2,3]");
    Assertions.assertTrue(equalTreePartition.checkEqualTree(root));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    TreeNode root = codec.deserialize("[1,2,10,null,null,2,20]");
    Assertions.assertFalse(equalTreePartition.checkEqualTree(root));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    TreeNode root = codec.deserialize("[0,-1,1]");
    Assertions.assertFalse(equalTreePartition.checkEqualTree(root));
  }
}
