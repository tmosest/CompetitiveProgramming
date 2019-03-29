package com.tmosest.competitiveprogramming.leetcode;

public class FlattenBinaryTreeToLinkedList {

  /**
   * Flatten a binary tree.
   * @param root The root of the tree.
   */
  public void flatten(TreeNode root) {
    if (root == null) {
      return;
    }
    TreeNode right = root.right;
    TreeNode left  = root.left;
    TreeNode prev = null;
    flatten(root.left);
    flatten(root.right);
    root.left = null;
    root.right = left;
    while (left != null) {
      prev = left;
      left = left.right;
    }
    if (prev != null) {
      prev.right = right;
    } else {
      root.right = right;
    }
  }
}
