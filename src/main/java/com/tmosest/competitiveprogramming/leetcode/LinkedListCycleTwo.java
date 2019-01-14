package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashSet;

public class LinkedListCycleTwo {

  /**
   * Return the node at which a cycle starts.
   * @param head
   * @return
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
