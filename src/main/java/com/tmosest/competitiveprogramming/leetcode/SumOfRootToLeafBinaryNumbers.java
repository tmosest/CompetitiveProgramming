package com.tmosest.competitiveprogramming.leetcode;

public class SumOfRootToLeafBinaryNumbers {

  private int total = 0;

  /**
   * Each root to leaf is a binary number.
   * Sum all leafs.
   * @param root The root of the binary tree.
   * @return The sum.
   */
  public int sumRootToLeaf(TreeNode root) {
    total = 0;
    sumRootToLeaf(root, 0);
    return total;
  }

  private void sumRootToLeaf(TreeNode root, int sum) {
    if (root == null) {
      return;
    }
    sum <<= 1;
    sum += root.val;
    if (root.left == null && root.right == null) {
      total += sum;
    }
    sumRootToLeaf(root.left, sum);
    sumRootToLeaf(root.right, sum);
  }
}
