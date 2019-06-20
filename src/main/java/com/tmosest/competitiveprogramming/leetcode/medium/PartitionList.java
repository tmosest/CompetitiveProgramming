package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

class PartitionList {

  public ListNode partition(ListNode head, int partitionPoint) {
    ListNode beforeHead = new ListNode(0);
    ListNode before = beforeHead;
    ListNode afterHead = new ListNode(0);
    ListNode after = afterHead;

    while (head != null) {

      // If the original list node is lesser than the given x,
      // assign it to the before list.
      if (head.val < partitionPoint) {
        before.next = head;
        before = before.next;
      } else {
        // If the original list node is greater or equal to the given x,
        // assign it to the after list.
        after.next = head;
        after = after.next;
      }

      // move ahead in the original list
      head = head.next;
    }

    // Last node of "after" list would also be ending node of the reformed list
    after.next = null;

    // Once all the nodes are correctly assigned to the two lists,
    // combine them to form a single list which would be returned.
    before.next = afterHead.next;

    return beforeHead.next;
  }
}
