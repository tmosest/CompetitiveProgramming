package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class ConstructBinarySearchTreeFromPreorderTraversal {

  int index = 0;

  TreeNode bstFromPreorder(int[] preorder) {
    if (preorder.length == 0) {
      return null;
    }

    return bstFromPreorder(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private TreeNode bstFromPreorder(int[] preorder, int min, int max) {

    TreeNode root = new TreeNode(preorder[index]);
    index++;

    if (preorder.length - 1 >= index && preorder[index] < root.val) {
      root.left = bstFromPreorder(preorder, min, root.val);
    }

    if (preorder.length - 1 >= index && preorder[index] >= root.val && preorder[index] <= max) {
      root.right = bstFromPreorder(preorder, root.val, max);
    }
    return root;
  }
}
