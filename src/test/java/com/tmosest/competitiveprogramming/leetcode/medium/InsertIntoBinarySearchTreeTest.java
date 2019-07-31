package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 701. Insert into a Binary Search Tree")
class InsertIntoBinarySearchTreeTest {

  private InsertIntoBinarySearchTree insertIntoBinarySearchTree = new InsertIntoBinarySearchTree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode result = insertIntoBinarySearchTree.insertIntoBst(null, 5);
    Assertions.assertEquals(5, result.val);
  }
}
