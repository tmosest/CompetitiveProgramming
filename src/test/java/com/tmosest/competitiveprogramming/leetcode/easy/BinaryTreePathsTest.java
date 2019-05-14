package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("binaryTree")
@DisplayName("LeetCode: 257. Binary Tree Paths")
class BinaryTreePathsTest {
	/* Write code here. */

  BinaryTreePaths binaryTreePaths = new BinaryTreePaths();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(5);

    List<String> expected = new LinkedList<>();
    expected.add("1->2->5");
    expected.add("1->3");
    Assertions.assertEquals(expected, binaryTreePaths.binaryTreePaths(root));
  }


}
