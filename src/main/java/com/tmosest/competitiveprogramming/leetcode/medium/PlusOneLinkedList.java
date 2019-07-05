package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

class PlusOneLinkedList {

  /**
   * Add one to the number that the linked list represents.
   *
   * @param head The head of the linked list.
   * @return The new head.
   */
  ListNode plusOne(ListNode head) {
    ListNode tempHead = new ListNode(0);
    tempHead.next = head;
    carryOver(tempHead);
    return (tempHead.val == 0) ? tempHead.next : tempHead;
  }

  private boolean carryOver(ListNode head) {
    if (head == null) {
      return false;
    }

    boolean hasCarryOver = head.next == null;

    if (head.next != null) {
      hasCarryOver = carryOver(head.next);
    }

    if (hasCarryOver) {
      head.val += 1;
      if (head.val > 9) {
        head.val -= 10;
        return true;
      }
    }

    return false;
  }
}
