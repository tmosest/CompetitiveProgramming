package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.Node;

import java.util.Stack;

public class SumLinks {

  private static int sumLinkList(Node<Integer> node) {
    int sum = 0;
    while (node != null) {
      sum *= 10;
      sum += node.data;
      node = node.next;
    }
    return sum;
  }

  private static int sumLinkListReversed(Node<Integer> node) {
    Stack<Integer> stack = new Stack<Integer>();
    while (node != null) {
      stack.push(node.data);
      node = node.next;
    }
    int sum = 0;
    while (!stack.empty()) {
      sum *= 10;
      sum += stack.pop();
    }
    return sum;
  }

  /**
   * Treas the values of the nodes as digits and sums them together.
   *
   * @param first First linked list.
   * @param second Second linked list.
   * @param reversed Should we reverse the linked lists?
   * @return Sum of two linked lists as digits.
   */
  public static int sumLinks(Node<Integer> first, Node<Integer> second, boolean reversed) {
    int sum = 0;
    if (reversed) {
      sum = sumLinkListReversed(first) + sumLinkListReversed(second);
    } else {
      sum = sumLinkList(first) + sumLinkList(second);
    }
    return sum;
  }

}
