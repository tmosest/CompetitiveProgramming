package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class BinaryTreeUpsideDown {

  /**
   * Turn a binary tree upside down.
   *
   * @param root The root of the tree.
   * @return The new root of the upside down tree.
   */
  TreeNode upsideDownBinaryTree(TreeNode root) {
    if (root == null || root.left == null && root.right == null) {
      return root;
    }

    final TreeNode newRoot = upsideDownBinaryTree(root.left);
    root.left.left = root.right;
    root.left.right = root;
    root.left = null;
    root.right = null;
    return newRoot;
  }
}
