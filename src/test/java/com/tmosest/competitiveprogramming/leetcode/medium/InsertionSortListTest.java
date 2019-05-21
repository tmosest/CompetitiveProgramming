package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("list")
@Tag("sort")
@DisplayName("LeetCode: 147. Insertion Sort List")
class InsertionSortListTest {
	/* Write code here. */

  InsertionSortList insertionSortList = new InsertionSortList();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    ListNode head = new ListNode(4);
    head.next = new ListNode(1);

    ListNode expected = new ListNode(1);
    expected.next = new ListNode(4);

    ListNode actual = insertionSortList.insertionSortList(head);

    while (expected != null && actual != null) {
      Assertions.assertEquals(expected.val, actual.val);
      expected = expected.next;
      actual = actual.next;
    }
  }


}
