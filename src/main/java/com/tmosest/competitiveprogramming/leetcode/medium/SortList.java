package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

class SortList {

  /**
   * Sort a list.
   *
   * @param head The head of the list.
   * @return The new head of the list.
   */
  ListNode sortList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    //Divide
    ListNode mid = head;
    ListNode right = head;
    while (right != null) { // Finding the midpoint
      right = right.next;
      if (right != null) {
        right = right.next;
        if (right != null) {
          mid = mid.next;
        }
      }
    }
    right = mid.next;
    mid.next = null;
    ListNode left = sortList(head);
    right = sortList(right);
    //Conquer
    ListNode result = new ListNode(Integer.MAX_VALUE);
    ListNode iter = result;
    while (left != null && right != null) {
      if (left.val < right.val) {
        iter.next = left;
        left = left.next;
      } else {
        iter.next = right;
        right = right.next;
      }
      iter = iter.next;
      iter.next = null;
    }
    if (left != null) {
      iter.next = left;
    } else {
      iter.next = right;
    }
    return result.next;
  }
}
