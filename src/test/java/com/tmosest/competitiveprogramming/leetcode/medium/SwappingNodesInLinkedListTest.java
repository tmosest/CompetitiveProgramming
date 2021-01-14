package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("list")
@Tag("wc223")
@DisplayName("LeetCode: 1721. Swapping Nodes in a Linked List")
class SwappingNodesInLinkedListTest {

  private SwappingNodesInLinkedList swappingNodesInLinkedList;

  @BeforeEach
  void setup() {
    swappingNodesInLinkedList = new SwappingNodesInLinkedList();
  }

  private void test(ListNode output, ListNode head, int k) {
    Assertions.assertEquals(output, swappingNodesInLinkedList.swapNodes(head, k));
  }

  @Test
  void test0() {
    test(null, null, 1);
  }
}
