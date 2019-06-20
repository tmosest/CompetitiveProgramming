package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 328. Odd Even Linked List")
class OddEvenLinkedListTest {

  private OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    oddEvenLinkedList.oddEvenList(new ListNode(0));
  }
}
