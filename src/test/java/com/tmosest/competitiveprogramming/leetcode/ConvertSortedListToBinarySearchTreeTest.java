package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;
import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@Tag("list")
@DisplayName("LeetCode: 109. Convert Sorted List to Binary Search Tree")
class ConvertSortedListToBinarySearchTreeTest {

  private ConvertSortedListToBinarySearchTree convertSortedListToBinarySearchTree = new ConvertSortedListToBinarySearchTree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    ListNode head = new ListNode(0);
    TreeNode root = convertSortedListToBinarySearchTree.sortedListToBst(head);
    Assertions.assertEquals(0, root.val);
  }
}
