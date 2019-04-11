package com.tmosest.competitiveprogramming.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class EqualTreePartition {

  /**
   * Determine if a tree can but cut into two trees with equal sums.
   * @param root The root of the tree.
   * @return True if deleting one edge produces a two trees with equal sums.
   */
  public boolean checkEqualTree(TreeNode root) {
    convertToSum(root);
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) {
      queue.add(root);
    }
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node != root && root.val == node.val + node.val) {
        return true;
      }
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
    return false;
  }

  private void convertToSum(TreeNode root) {
    if (root == null) {
      return;
    }
    convertToSum(root.left);
    convertToSum(root.right);
    if (root.left != null) {
      root.val += root.left.val;
    }
    if (root.right != null) {
      root.val += root.right.val;
    }
  }
}
