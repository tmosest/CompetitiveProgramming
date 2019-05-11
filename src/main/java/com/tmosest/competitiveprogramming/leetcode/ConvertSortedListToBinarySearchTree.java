package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

public class ConvertSortedListToBinarySearchTree {

  /**
   * Take a sorted list and turn it into a balanced binary search tree.
   * @param head The head of the list.
   * @return The root of the tree.
   */
  public TreeNode sortedListToBst(ListNode head) {
    // If the head doesn't exist, then the linked list is empty
    if (head == null) {
      return null;
    }
    // Find the middle element for the list.
    ListNode mid = findMiddleElement(head);
    // The mid becomes the root of the BST.
    TreeNode node = new TreeNode(mid.val);
    // Base case when there is just one element in the linked list
    if (head == mid) {
      return node;
    }
    // Recursively form balanced BSTs using the left and right halves of the original list.
    node.left = sortedListToBst(head);
    node.right = sortedListToBst(mid.next);
    return node;
  }

  private ListNode findMiddleElement(ListNode head) {
    // The pointer used to disconnect the left half from the mid node.
    ListNode prevPtr = null;
    ListNode slowPtr = head;
    ListNode fastPtr = head;
    // Iterate until fastPr doesn't reach the end of the linked list.
    while (fastPtr != null && fastPtr.next != null) {
      prevPtr = slowPtr;
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
    }
    // Handling the case when slowPtr was equal to head.
    if (prevPtr != null) {
      prevPtr.next = null;
    }
    return slowPtr;
  }
}
