package com.tmosest.competitiveprogramming.leetcode;

public class MergeTwoBinaryTrees {

  /**
   * Merge two binary trees and sum root.
   * @param treeOne The first binary tree.
   * @param treeTwo The second binary tree.
   * @return The combined tree.
   */
  public TreeNode mergeTrees(TreeNode treeOne, TreeNode treeTwo) {
    if (treeOne == null && treeTwo == null) {
      return null;
    }
    if (treeOne == null || treeTwo == null) {
      return (treeOne == null) ? treeTwo : treeOne;
    }
    TreeNode newRoot = new TreeNode(treeOne.val + treeTwo.val);
    helperMergeTrees(newRoot, treeOne, treeTwo);
    return newRoot;
  }

  private void helperMergeTrees(TreeNode newRoot, TreeNode treeOne, TreeNode treeTwo) {
    if (treeOne == null) {
      treeOne = new TreeNode(0);
    }
    if (treeTwo == null) {
      treeTwo = new TreeNode(0);
    }
    if (treeOne.left != null || treeTwo.left != null) {
      int val = (treeOne.left == null) ? treeTwo.left.val : treeOne.left.val;
      if (treeOne.left != null && treeTwo.left != null) {
        val = treeOne.left.val + treeTwo.left.val;
      }
      newRoot.left = new TreeNode(val);
      helperMergeTrees(newRoot.left, treeOne.left, treeTwo.left);
    }
    if (treeOne.right != null || treeTwo.right != null) {
      int val = (treeOne.right == null) ? treeTwo.right.val : treeOne.right.val;
      if (treeOne.right != null && treeTwo.right != null) {
        val = treeOne.right.val + treeTwo.right.val;
      }
      newRoot.right = new TreeNode(val);
      helperMergeTrees(newRoot.right, treeOne.right, treeTwo.right);
    }
  }
}
