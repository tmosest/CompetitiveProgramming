package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class SmallestSubtreeWithAllTheDeepestNodes {

  TreeNode subtreeWithAllDeepest(TreeNode root) {
    return dfs(root).node;
  }

  // Return the result of the subtree at this node.
  private Result dfs(TreeNode node) {
    if (node == null) {
      return new Result(null, 0);
    }
    Result left = dfs(node.left);
    Result right = dfs(node.right);
    if (left.dist > right.dist) {
      return new Result(left.node, left.dist + 1);
    }
    if (left.dist < right.dist) {
      return new Result(right.node, right.dist + 1);
    }
    return new Result(node, left.dist + 1);
  }

  private class Result {
    private TreeNode node;
    private int dist;

    private Result(TreeNode node, int dist) {
      this.node = node;
      this.dist = dist;
    }
  }
}
