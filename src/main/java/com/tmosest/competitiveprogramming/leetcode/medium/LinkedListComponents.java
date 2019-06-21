package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

class LinkedListComponents {

  /**
   * Determine the number of connected components in a list.
   *
   * @param head The head of the list.
   * @param components The elements in question.
   * @return How many connected components originate from the components.
   */
  int numComponents(ListNode head, int[] components) {
    Set<Integer> set = new HashSet<>();

    for (int val : components) {
      set.add(val);
    }

    int result = 0;

    while (head != null) {
      if (set.contains(head.val) && (head.next == null || !set.contains(head.next.val))) {
        ++result;
      }
      head = head.next;
    }

    return result;
  }
}
