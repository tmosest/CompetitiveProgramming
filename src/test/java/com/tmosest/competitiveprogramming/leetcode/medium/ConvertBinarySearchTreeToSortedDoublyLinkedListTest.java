package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 426. Convert Binary Search Tree to Sorted Doubly Linked List")
class ConvertBinarySearchTreeToSortedDoublyLinkedListTest {

  private Codec codec = new Codec();

  private ConvertBinarySearchTreeToSortedDoublyLinkedList convertBinarySearchTreeToSortedDoublyLinkedList =
      new ConvertBinarySearchTreeToSortedDoublyLinkedList();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String tree = "[4,2,5,1,3]";
    TreeNode root = codec.deserialize(tree);
    TreeNode head = convertBinarySearchTreeToSortedDoublyLinkedList.treeToDoublyList(root);

    Assertions.assertNotNull(head);
    for (int i = 0; i < tree.split(",").length; i++) {
      Assertions.assertEquals(i + 1, head.val);
      head = head.right;
    }
  }
}
