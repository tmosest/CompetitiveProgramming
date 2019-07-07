package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class BinaryTreePruning {

  /**
   * Prune the tree of sub-trees that do not have ones in them.
   *
   * @param root The root of the tree.
   * @return The new root.
   */
  TreeNode pruneTree(TreeNode root) {
    return containsOne(root) ? root : null;
  }

  private boolean containsOne(TreeNode root) {
    if (root == null) {
      return false;
    }

    if (root.left == null && root.right == null) {
      return root.val == 1;
    }

    boolean containsLeft = containsOne(root.left);
    boolean containsRight = containsOne(root.right);

    if (!containsLeft) {
      root.left = null;
    }

    if (!containsRight) {
      root.right = null;
    }

    return containsLeft || containsRight || root.val == 1;
  }
}
