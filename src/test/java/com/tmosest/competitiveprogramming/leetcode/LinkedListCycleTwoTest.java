package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("list")
@DisplayName("LeetCode: 142. Linked List Cycle II")
public class LinkedListCycleTwoTest {

  LinkedListCycleTwo linkedListCycleTwo = new LinkedListCycleTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = head;
    Assertions.assertEquals(head, linkedListCycleTwo.detectCycle(head));
  }
}