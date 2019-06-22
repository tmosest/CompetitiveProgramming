package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import com.tmosest.competitiveprogramming.leetcode.common.TreeNodeAdapter;
import com.tmosest.competitiveprogramming.utils.tree.UtilTreeNode;

class ConvertBinarySearchTreeToSortedDoublyLinkedList {

  private UtilTreeNode<Integer> head = new UtilTreeNode<>(Integer.MAX_VALUE);
  private UtilTreeNode<Integer> tail = new UtilTreeNode<>(Integer.MIN_VALUE);
  private UtilTreeNode<Integer> prev = null;

  /**
   * Convert a BST to a doubly sorted linked list in place.
   *
   * @param root The root of the BST.
   * @return The head of the linked list.
   */
  TreeNode treeToDoublyList(TreeNode root) {
    prev = null;
    UtilTreeNode<Integer> utilRoot = TreeNodeAdapter.convertToUtility(root);
    for (UtilTreeNode<Integer> node : utilRoot.iterateInorder()) {
      if (node.val < head.val) {
        head = node;
      }

      if (node.val > tail.val) {
        tail = node;
      }

      if (prev != null) {
        node.left = prev;
        prev.right = node;
      }

      prev = node;
    }
    head.left = tail;
    tail.right = head;
    return root == null ? null : TreeNodeAdapter.convertToTreeNode(head);
  }
}
