package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("list")
@Tag("wc179")
@Tag("binaryTree")
@DisplayName("LeetCode: 1367. Linked List in Binary Tree")
class LinkedListInBinaryTreeTest {

  private Codec codec = new Codec();
  private LinkedListInBinaryTree linkedListInBinaryTree =
      new LinkedListInBinaryTree();

  @Test
  void testCase0() {
    Assertions.assertTrue(linkedListInBinaryTree.isSubPath(
        ListNode.fromString("[4,2,8]"),
        codec.deserialize("[1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]")
    ));
  }

  @Test
  void testCase1() {
    Assertions.assertFalse(linkedListInBinaryTree.isSubPath(
        ListNode.fromString("[1,4,2,6,8]"),
        codec.deserialize("[1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]")
    ));
  }
}
