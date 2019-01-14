package com.tmosest.competitiveprogramming.leetcode;

public class InsertionSortList {

  /**
   * Insertion sort a list.
   * @param head The head node.
   * @return Return the head of the sorted list.
   */
  public ListNode insertionSortList(ListNode head) {
    ListNode dummy = new ListNode(0);
    ListNode prev = dummy;
    ListNode current = head;

    while (current != null) {

      if (prev.val > current.val) {
        prev = dummy;
      }

      while (prev.next != null && prev.next.val < current.val) {
        prev = prev.next;
      }

      ListNode nextNode = current.next;
      current.next = prev.next;
      prev.next = current;
      current = nextNode;
    }
    return dummy.next;
  }
}
