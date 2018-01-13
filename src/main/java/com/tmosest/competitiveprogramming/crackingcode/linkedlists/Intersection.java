package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.Node;

public class Intersection {

  private static int getLenghth(Node<Integer> head) {
    if (head == null) {
      return 0;
    }
    Node<Integer> node = head;
    int length = 0;
    while (node != null) {
      length++;
      node = node.next;
    }
    return length;
  }

  /**
   * Determines if two Linked List intersect.
   *
   * @param first First head.
   * @param second Second Head.
   * @return The Intersection Node.
   */
  public static Node<Integer> intersect(Node<Integer> first, Node<Integer> second) {
    int difference = getLenghth(first) - getLenghth(second);
    Node<Integer> larger = (difference > 0) ? first : second;
    Node<Integer> smaller = (difference > 0) ? second : first;
    difference = Math.abs(difference);
    for (int i = 0; i < difference; i++) {
      larger = larger.next;
    }
    while (larger != null && smaller != null) {
      if (larger == smaller) {
        return larger;
      }
      larger = larger.next;
      smaller = smaller.next;
    }
    return null;
  }

}
