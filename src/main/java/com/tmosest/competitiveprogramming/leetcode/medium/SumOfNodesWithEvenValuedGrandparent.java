package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class SumOfNodesWithEvenValuedGrandparent {

  private int sum;

  int sumEvenGrandparent(TreeNode root) {
    sum = 0;
    if (root == null) {
      return sum;
    }
    generateSum(root, null, null);
    return sum;
  }

  private void generateSum(TreeNode node, TreeNode otherNode, TreeNode gp) {
    if (node == null) {
      return;
    }
    if (gp != null && gp.val % 2 == 0) {
      sum = sum + node.val;
    }
    generateSum(node.left, node, otherNode);
    generateSum(node.right, node, otherNode);

  }
}
