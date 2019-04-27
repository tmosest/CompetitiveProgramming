package com.tmosest.competitiveprogramming.leetcode;

class AddOneRowToTree {

  /**
   * Add a row to a binary tree at depth with the given value.
   * @param root The root of the binary tree.
   * @param val The value we are adding.
   * @param depth The depth we are adding this row at.
   * @return The root of the tree.
   */
  TreeNode addOneRow(TreeNode root, int val, int depth) {
    if (depth == 1) {
      TreeNode node = new TreeNode(val);
      node.left = root;
      return root;
    }
    addOneRow(root, depth, val, 1);
    return root;
  }

  private void addOneRow(TreeNode root, int depth, int val, int level) {
    if (root == null) {
      return;
    }
    if (level == depth - 1) {
      TreeNode temp = root.left;
      root.left = new TreeNode(val);
      root.left.left = temp;
      temp = root.right;
      root.right = new TreeNode(val);
      root.right.right = temp;
      return;
    }
    addOneRow(root.left, depth, val, level + 1);
    addOneRow(root.right, depth, val, level + 1);
  }
}
