package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class CountCompleteTreeNodes {

  private int count;

  int countNodes(TreeNode root) {
    count = 0;
    traverse(root);
    return count;
  }

  private void traverse(TreeNode root) {
    if (root == null) {
      return;
    }
    ++count;
    traverse(root.left);
    traverse(root.right);
  }
}
