package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 369. Plus One Linked List")
class PlusOneLinkedListTest {

  private PlusOneLinkedList plusOneLinkedList = new PlusOneLinkedList();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("[1,2,4]", plusOneLinkedList.plusOne(ListNode.fromString("[1,2,3]")).toString());
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("[1,0,0,0]", plusOneLinkedList.plusOne(ListNode.fromString("[9,9,9]")).toString());
  }
}
