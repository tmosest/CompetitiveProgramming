package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class InsufficientNodesInRootToLeafPaths {

  /**
   * Remove paths that don't meet a limit.
   *
   * @param root The root of the tree.
   * @param limit The limit for the path.
   * @return Root of slimmed down tree.
   */
  TreeNode sufficientSubset(TreeNode root, int limit) {
    int value = branchValue(root, 0, limit);
    if (value < limit) {
      return null;
    }
    return root;

  }

  private int branchValue(TreeNode root, int curValue, int limit) {
    if (root == null) {
      return curValue;
    }
    curValue += root.val;
    int leftVal = branchValue(root.left, curValue, limit);
    int rightVal = branchValue(root.right, curValue, limit);
    if (leftVal < limit) {
      root.left = null;
    }
    if (rightVal < limit) {
      root.right = null;
    }
    return Math.max(leftVal, rightVal);
  }
}
