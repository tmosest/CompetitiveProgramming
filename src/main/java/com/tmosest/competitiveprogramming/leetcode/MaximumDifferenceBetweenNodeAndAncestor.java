package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashSet;
import java.util.Set;

class MaximumDifferenceBetweenNodeAndAncestor {

  private int result = 0;

  /**
   * Determine the max difference between an ancestor and value.
   * @param root The root of the tree.
   * @return The max difference between any node and one of its ancestors.
   */
  int maxAncestorDiff(TreeNode root) {
    result = 0;
    maxAncestorDiff(root, new HashSet<>());
    return result;
  }

  private void maxAncestorDiff(TreeNode root, Set<Integer> ancestors) {
    if (root == null) {
      return;
    }
    int val = root.val;
    for (int num : ancestors) {
      int diff = Math.abs(val - num);
      result = Math.max(result, diff);
    }
    Set<Integer> newAncestors = new HashSet<>(ancestors);
    newAncestors.add(root.val);
    maxAncestorDiff(root.left, newAncestors);
    maxAncestorDiff(root.right, newAncestors);
  }
}
