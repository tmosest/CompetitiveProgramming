package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

class ReverseLinkedListTwo {
  /* Write code here. */

  /**
   * Function to reverse the nodes in a list from one index to another with 1 <= m < n <= length.
   *
   * @param head The head of the linked list.
   * @param start The start index.
   * @param end The end index.
   * @return The new head of the linked list.
   */
  public ListNode reverseBetween(ListNode head, int start, int end) {
    ListNode dummy = new ListNode(0);
    ListNode prev = dummy;
    dummy.next = head;

    for (int i = 1; i < start; i++) {
      prev = prev.next;
    }

    ListNode current = prev.next;

    for (int i = 0; i < end - start; i++) {
      ListNode temp = current.next;
      current.next = temp.next;
      temp.next = prev.next;
      prev.next = temp;
    }

    return dummy.next;
  }


}
