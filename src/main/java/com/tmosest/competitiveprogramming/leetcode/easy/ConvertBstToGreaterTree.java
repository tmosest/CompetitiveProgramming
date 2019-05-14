package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class ConvertBstToGreaterTree {
  /* Write code here. */

  private int sum = 0;

  /**
   * Convert BST to greater than tree.
   *
   * @param root The root of the BST.
   * @return The root of the Greater Than Tree.
   */
  public TreeNode convertBst(TreeNode root) {
    if (root != null) {
      convertBst(root.right);
      sum += root.val;
      root.val = sum;
      convertBst(root.left);
    }
    return root;
  }


}
