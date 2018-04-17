package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.LinkedList;
import com.tmosest.competitiveprogramming.datastructures.implementations.Node;

import java.util.Stack;

public class KthLast {

  /**
   * Get the kth last int from a linked list. Assuming the index is good.
   *
   * @param linkedList Linked List to get the item from.
   * @param index The index away from the end.
   * @return Return the integer value.
   */
  public static int kthLast(LinkedList<Integer> linkedList, int index) {
    Node<Integer> head = linkedList.head();
    Node<Integer> runner = linkedList.head();
    // Run runner
    for (int i = 0; i < index; i++) {
      runner = runner.next;
    }
    // Now when runner end head is index away!
    while (runner.next != null) {
      head = head.next;
      runner = runner.next;
    }
    return head.data;
  }

}
