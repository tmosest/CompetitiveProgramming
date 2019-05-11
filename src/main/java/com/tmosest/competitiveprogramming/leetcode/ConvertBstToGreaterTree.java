package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

public class ConvertBstToGreaterTree {

  private int sum = 0;

  /**
   * Convert BST to greater than tree.
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
