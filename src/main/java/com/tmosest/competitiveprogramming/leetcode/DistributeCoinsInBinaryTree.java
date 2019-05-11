package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

public class DistributeCoinsInBinaryTree {

  private int totalNumberOfMoves = 0;

  /**
   * Distribute coins in a binary tree.
   * @param root The root of the tree.
   * @return The number of moves required to make every node have a coin.
   */
  public int distributeCoins(TreeNode root) {
    totalNumberOfMoves = 0;
    dfs(root);
    return totalNumberOfMoves;
  }

  private int dfs(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = dfs(root.left);
    int right = dfs(root.right);
    totalNumberOfMoves += Math.abs(left) + Math.abs(right);
    return root.val + left + right - 1;
  }
}
