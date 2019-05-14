package com.tmosest.competitiveprogramming.leetcode.common;

public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  /**
   * Create a new tree node with a given value.
   * @param val The value to set the node to.
   */
  public TreeNode(int val) {
    this.val = val;
  }

  /**
   * Determines if two trees are equals.
   * @param root The other tree.
   * @return True if they are equal and false otherwise.
   */
  public boolean equals(TreeNode root) {
    return TreeNodeAdapter
        .convertToUtility(this)
        .equals(TreeNodeAdapter.convertToUtility(root));
  }
}
