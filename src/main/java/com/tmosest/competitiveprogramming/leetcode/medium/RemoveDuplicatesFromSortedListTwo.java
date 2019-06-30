package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

class RemoveDuplicatesFromSortedListTwo {

  /**
   * Remove all values that have dupes from a list.
   *
   * @param head The head of the list.
   * @return The new head of the list.
   */
  ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;
    ListNode cur = head;
    while (cur != null) {
      // use a while loop to skip all same values for current
      while (cur.next != null && cur.val == cur.next.val) {
        cur = cur.next;
      }
      // there is only one element without duplicate,
      // the code didn't enter the while loop above
      // can move pre to pre.next
      if (prev.next == cur) {
        prev = prev.next;
      } else {
        prev.next = cur.next;
      }
      // advance the cur pointer after each operation
      cur = cur.next;
    }
    return dummy.next;
  }
}
