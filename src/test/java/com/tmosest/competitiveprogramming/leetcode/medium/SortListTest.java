package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 148. Sort List")
class SortListTest {

  private SortList sortList = new SortList();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    ListNode head = new ListNode(8);
    head.next = new ListNode(7);
    head.next.next = new ListNode(9);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(2);

    head = sortList.sortList(head);

    int prev = Integer.MIN_VALUE;
    while (head != null) {
      int curr = head.val;
      Assertions.assertTrue(curr >= prev);
      head = head.next;
      prev = curr;
    }
  }
}
