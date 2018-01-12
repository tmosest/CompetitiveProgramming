package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.Node;

public class DeleteMiddleNode {

  /**
   * Deletes a middle node.
   *
   * @param node Middle Node to delete.
   * @return True if a middle node was deleted.
   */
  public static boolean deleteMiddleNode(Node<Integer> node) {
    if (node == null || node.next == null) {
      return false;
    }
    Node<Integer> next = node.next;
    node.data = next.data;
    node.next = next.next;
    return true;
  }

}
