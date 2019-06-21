package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class ConvertBinarySearchTreeToSortedDoublyLinkedList {

  private TreeNode head = new TreeNode(Integer.MAX_VALUE);
  private TreeNode tail = new TreeNode(Integer.MIN_VALUE);
  private TreeNode prev = null;

  /**
   * Convert a BST to a doubly sorted linked list in place.
   *
   * @param root The root of the BST.
   * @return The head of the linked list.
   */
  TreeNode treeToDoublyList(TreeNode root) {
    prev = null;
    inOrderTraversal(root);
    head.left = tail;
    tail.right = head;
    return root == null ? null : head;
  }

  private void inOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }

    if (root.left != null) {
      inOrderTraversal(root.left);
    }

    if (root.val < head.val) {
      head = root;
    }

    if (root.val > tail.val) {
      tail = root;
    }

    TreeNode right = root.right;

    if (prev != null) {
      root.left = prev;
      prev.right = root;
    }

    prev = root;

    if (right != null) {
      inOrderTraversal(right);
    }
  }
}
