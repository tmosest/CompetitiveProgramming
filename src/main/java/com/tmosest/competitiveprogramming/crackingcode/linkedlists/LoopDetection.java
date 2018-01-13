package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.Node;

public class LoopDetection {

  /**
   * Loops for a loop and returns the node for which one occurs.
   *
   * @param head Head Node.
   * @return null or Node where loop starts.
   */
  public static Node<Integer> findLoopNode(Node<Integer> head) {
    // Start slow and fast pointers
    Node<Integer> slow = head;
    Node<Integer> fast = head;
    // Find Loop
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        break;
      }
    }
    // Check for no loops
    if (fast == null || fast.next == null) {
      return null;
    }
    // Otherwise reset slow and let's find the first one.
    slow = head;
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }
    return fast;
  }
}
