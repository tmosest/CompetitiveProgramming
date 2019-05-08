package com.tmosest.competitiveprogramming.leetcode;

class RangeSumOfBst {

  private static int sum = 0;

  /**
   * Finds the sum of numbers with in a range.
   *
   * @param root The root of the tree.
   * @param left The left most value we are looking for.
   * @param right The right most value we are looking for.
   * @return The sum of all nodes with values in [left, right].
   */
  int rangeSumBst(TreeNode root, int left, int right) {
    sum = 0;
    rangeSumBstHelper(root, left, right);
    return sum;
  }

  private void rangeSumBstHelper(TreeNode root, int left, int right) {
    if (root == null) {
      return;
    }
    int val = root.val;
    if (left <= val && val <= right) {
      sum += val;
    }
    rangeSumBstHelper(root.left, left, right);
    rangeSumBstHelper(root.right, left, right);
  }
}
