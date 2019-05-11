package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("binaryTree")
@DisplayName("LeetCode: 538. Convert BST to Greater Tree")
public class ConvertBstToGreaterTreeTest {

  ConvertBstToGreaterTree convertBstToGreaterTree = new ConvertBstToGreaterTree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(5);
    Assertions.assertEquals(root, convertBstToGreaterTree.convertBst(root));
  }
}
