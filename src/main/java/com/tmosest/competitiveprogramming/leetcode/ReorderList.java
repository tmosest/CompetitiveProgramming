package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReorderList {

  /**
   * Reorders a list with a zip-zag type order.
   * @param head The head of the list.
   */
  public void reorderList(ListNode head) {
    List<ListNode> nodes = new ArrayList<>();
    while (head != null) {
      nodes.add(head);
      head = head.next;
    }
    if (nodes.size() < 2) {
      return;
    }
    for (int i = 0; i <= nodes.size() / 2; i++) {
      ListNode node = nodes.get(i);
      if (i == nodes.size() / 2) {
        node.next = null;
      } else {
        ListNode alt = nodes.get(nodes.size() - 1 - i);
        node.next = alt;
        alt.next = nodes.get(i + 1);
      }
    }
  }
}
