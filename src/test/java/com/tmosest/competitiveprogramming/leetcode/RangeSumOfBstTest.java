package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 938. Range Sum of BST")
class RangeSumOfBstTest {

  private RangeSumOfBst rangeSumOfBst = new RangeSumOfBst();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(0, rangeSumOfBst.rangeSumBst(null, 0, 0));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    TreeNode treeNode = new TreeNode(10);
    treeNode.left = new TreeNode(5);
    treeNode.right = new TreeNode(15);
    treeNode.left.left = new TreeNode(3);
    treeNode.left.right = new TreeNode(7);
    treeNode.right.right = new TreeNode(18);

    Assertions.assertEquals(32, rangeSumOfBst.rangeSumBst(treeNode,7, 15));
  }
}
