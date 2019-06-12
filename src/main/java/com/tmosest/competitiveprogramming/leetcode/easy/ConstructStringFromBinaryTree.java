package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class ConstructStringFromBinaryTree {

  /**
   * Converts a tree to a string.
   *
   * @param root The root of the node.
   * @return A string representation.
   */
  String tree2str(TreeNode root) {
    if (root == null) {
      return "";
    }
    if (root.left == null && root.right == null) {
      return root.val + "";
    }
    if (root.right == null) {
      return root.val + "(" + tree2str(root.left) + ")";
    }
    return root.val + "(" + tree2str(root.left) + ")(" + tree2str(root.right) + ")";
  }
}
