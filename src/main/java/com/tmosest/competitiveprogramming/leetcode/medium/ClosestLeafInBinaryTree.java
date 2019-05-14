package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import com.tmosest.competitiveprogramming.leetcode.common.TreeNodeAdapter;
import com.tmosest.competitiveprogramming.utils.UtilTreeNode;

class ClosestLeafInBinaryTree {
  /* Write code here. */

  /**
   * Find the value of the leaf that is closest (distance) to the node given.
   *
   * @param root The root of the tree.
   * @param search The value of the node to search from.
   * @return The value of the closest leaf (distance).
   */
  int findClosestLeaf(TreeNode root, int search) {
    UtilTreeNode<Integer> integerUtilTreeNode = TreeNodeAdapter.convertToUtility(root);
    Integer result = integerUtilTreeNode.findClosestLeaf(search);
    return (result == null) ? -1 : result;
  }


}
