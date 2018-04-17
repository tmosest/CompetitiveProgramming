package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.Node;

public class Partition {

  /**
   * Partions a linked list based on a value.
   *
   * @param head First node in the Linked List.
   * @param value Where to partition.
   * @return True if a partition was created.
   */
  public static boolean partitioned(Node<Integer> head, int value) {
    if (head == null || head.next == null) {
      return false;
    }
    Node<Integer> less = null;
    Node<Integer> greater = null;
    while (head != null) {
      if (head.data < value) {
        if (less == null) {
          less = head;
        } else {
          less.next = head;
          less = less.next;
        }
      } else {
        if (greater == null) {
          greater = head;
        } else {
          greater.next = head;
          greater = greater.next;
        }
      }
      head = head.next;
    }
    if (less != null) {
      less.next = greater;
    }
    return true;
  }

}
