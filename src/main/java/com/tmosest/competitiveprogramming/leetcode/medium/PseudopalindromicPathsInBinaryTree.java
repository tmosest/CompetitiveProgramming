package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class PseudopalindromicPathsInBinaryTree {

  private int res = 0;

  int pseudoPalindromicPaths(TreeNode root) {
    dfs(root, 0);
    return res;
  }


  private void dfs(TreeNode root, int mask) {
    if (root == null) {
      return;
    }

    mask = mask ^ (1 << root.val);

    if (root.left == null && root.right == null) {

      if ((mask == 0) || (mask & (mask - 1)) == 0) {
        res++;
      }
      return;
    }

    dfs(root.left, mask);
    dfs(root.right, mask);
  }
}
