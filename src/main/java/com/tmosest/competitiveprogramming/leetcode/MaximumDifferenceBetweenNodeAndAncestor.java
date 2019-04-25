package com.tmosest.competitiveprogramming.leetcode;

class MaximumDifferenceBetweenNodeAndAncestor {

  private int result = 0;

  /**
   * Determine the max difference between an ancestor and value.
   * @param root The root of the tree.
   * @return The max difference between any node and one of its ancestors.
   */
  int maxAncestorDiff(TreeNode root) {
    result = 0;
    maxAncestorDiff(root,root.val, root.val);
    return result;
  }

  private void maxAncestorDiff(TreeNode root, int max, int min) {
    if (root == null) {
      return;
    }
    max = Math.max(root.val, max);
    min = Math.min(root.val, min);
    result = Math.max(result, max - min);
    maxAncestorDiff(root.left, max, min);
    maxAncestorDiff(root.right, max, min);
  }
}
