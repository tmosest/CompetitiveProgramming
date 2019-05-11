package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

public class BinaryTreeTilt {

  private int tilt = 0;

  /**
   * Find the tilt which is the absolute difference between right and left sum.
   * @param root The root node.
   * @return The tilt.
   */
  public int findTilt(TreeNode root) {
    tilt = 0;
    traverse(root);
    return tilt;
  }

  private int traverse(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = traverse(root.left);
    int right = traverse(root.right);
    tilt += Math.abs(left - right);
    return left + right + root.val;
  }
}
