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
    Stack<Integer> stack = new Stack<Integer>();
    Node<Integer> head = linkedList.head();
    while (head != null) {
      stack.push(head.data);
      head = head.next;
    }
    int result = -1;
    for (int i = 0; i <= index; i++) {
      result = stack.pop();
    }
    return result;
  }

}
