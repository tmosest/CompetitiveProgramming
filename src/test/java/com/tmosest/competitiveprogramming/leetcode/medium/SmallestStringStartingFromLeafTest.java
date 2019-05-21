package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@Tag("string")
@DisplayName("LeetCode: 988. Smallest String Starting From Leaf")
class SmallestStringStartingFromLeafTest {
	/* Write code here. */

  SmallestStringStartingFromLeaf smallestStringStartingFromLeaf = new SmallestStringStartingFromLeaf();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(5);

    Assertions.assertEquals("dba", smallestStringStartingFromLeaf.smallestFromLeaf(root));
  }


}
