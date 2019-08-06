package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class InsertIntoBinarySearchTree {

  TreeNode insertIntoBst(TreeNode root, int val) {
    if (root == null) {
      return new TreeNode(val);
    } else {
      insertIntoCurrentSubTree(root, val);
    }
    return root;
  }

  private void insertIntoCurrentSubTree(TreeNode root, int val) {
    if (root.val > val) {
      if (root.left == null) {
        root.left = new TreeNode(val);
      } else {
        insertIntoCurrentSubTree(root.left, val);
      }
    } else if (root.val < val) {
      if (root.right == null) {
        root.right = new TreeNode(val);
      } else {
        insertIntoCurrentSubTree(root.right, val);
      }
    }
  }
}
