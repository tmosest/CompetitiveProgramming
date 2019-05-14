package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import com.tmosest.competitiveprogramming.leetcode.common.TreeNodeAdapter;
import com.tmosest.competitiveprogramming.utils.UtilTreeNode;

class EqualTreePartition {
  /* Write code here. */

  /**
   * Determine if a tree can but cut into two trees with equal sums.
   *
   * @param root The root of the tree.
   * @return True if deleting one edge produces a two trees with equal sums.
   */
  boolean checkEqualTree(TreeNode root) {
    UtilTreeNode<Integer> utilRoot = TreeNodeAdapter.convertToUtility(root);
    convertToBottomUpSumTree(utilRoot);
    for (UtilTreeNode<Integer> node : utilRoot.iterateLevelByLevel()) {
      if (node != utilRoot && utilRoot.val == node.val + node.val) {
        return true;
      }
    }
    return false;
  }

  private void convertToBottomUpSumTree(UtilTreeNode<Integer> root) {
    if (root == null) {
      return;
    }
    convertToBottomUpSumTree(root.left);
    convertToBottomUpSumTree(root.right);
    if (root.left != null) {
      root.val += root.left.val;
    }
    if (root.right != null) {
      root.val += root.right.val;
    }
  }


}
