package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class DeleteLeavesWithGivenValue {

  TreeNode removeLeafNodes(TreeNode root, int target) {

    removeLeafNodes(root, null, target, true);

    if (root.val == target && root.left == null && root.right == null) {
      return null;
    }

    return root;
  }

  private void removeLeafNodes(TreeNode node, TreeNode parent, int target, boolean isLeft) {
    if (node == null) {
      return;
    }

    if (!isLeaf(node)) {
      removeLeafNodes(node.left, node, target, true);
      removeLeafNodes(node.right, node, target, false);
    }

    if (isLeaf(node) && parent != null && node.val == target) {
      if (isLeft) {
        parent.left = null;
      } else {
        parent.right = null;
      }
    }
  }

  private boolean isLeaf(TreeNode node) {
    return node.right == null && node.left == null;
  }
}
