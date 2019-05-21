package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("list")
@DisplayName("LeetCode: 92. Reverse Linked List II")
class ReverseLinkedListTwoTest {
	/* Write code here. */

  ReverseLinkedListTwo reverseLinkedListTwo = new ReverseLinkedListTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);

    ListNode expected = new ListNode(5);
    expected.next = new ListNode(4);
    expected.next.next = new ListNode(3);
    expected.next.next.next = new ListNode(2);
    expected.next.next.next.next = new ListNode(1);
    expected.next.next.next.next.next = new ListNode(6);

    ListNode actual = reverseLinkedListTwo.reverseBetween(head, 1, 5);
    while (actual != null && expected != null) {
      Assertions.assertEquals(expected.val, actual.val);
      actual = actual.next;
      expected = expected.next;
    }
    Assertions.assertEquals(expected, actual);
  }


}
