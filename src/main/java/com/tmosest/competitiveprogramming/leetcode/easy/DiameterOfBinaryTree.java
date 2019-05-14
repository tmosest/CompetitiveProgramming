package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class DiameterOfBinaryTree {

  /* Write code here. */
  private int answer;

  /**
   * Determine the diameter of a binary tree. (Length of longest path).
   *
   * @param root The root node.
   * @return The length of the longest path in the tree.
   */
  public int diameterOfBinaryTree(TreeNode root) {
    answer = 1;
    depth(root);
    return answer - 1;
  }

  private int depth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = depth(root.left);
    int right = depth(root.right);
    answer = Math.max(answer, left + right + 1);
    return Math.max(left, right) + 1;
  }
}
