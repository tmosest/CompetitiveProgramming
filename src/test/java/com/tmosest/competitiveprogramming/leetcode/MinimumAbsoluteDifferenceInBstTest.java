package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("binarySearchTree")
@DisplayName("LeetCode: 530. Minimum Absolute Difference in BST")
public class MinimumAbsoluteDifferenceInBstTest {

  MinimumAbsoluteDifferenceInBst minimumAbsoluteDifferenceInBst = new MinimumAbsoluteDifferenceInBst();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode treeNode = new TreeNode(1);
    treeNode.right = new TreeNode(3);
    treeNode.right.left = new TreeNode(2);

    Assertions.assertEquals(1, minimumAbsoluteDifferenceInBst.getMinimumDifference(treeNode));
  }
}
