package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

import java.util.HashSet;

class LinkedListCycleTwo {
  /* Write code here. */

  /**
   * Return the node at which a cycle starts.
   *
   * @param head The root node of the list.
   * @return The node that is first repeated.
   */
  public ListNode detectCycle(ListNode head) {
    HashSet<ListNode> set = new HashSet<>();
    while (head != null) {
      if (set.contains(head)) {
        return head;
      }
      set.add(head);
      head = head.next;
    }
    return null;
  }


}
