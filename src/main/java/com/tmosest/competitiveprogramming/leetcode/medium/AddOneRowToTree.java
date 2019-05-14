package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import com.tmosest.competitiveprogramming.leetcode.common.TreeNodeAdapter;

class AddOneRowToTree {

  /**
   * Add a row to a binary tree at depth with the given value.
   * @param root The root of the binary tree.
   * @param val The value we are adding.
   * @param depth The depth we are adding this row at.
   * @return The root of the tree.
   */
  TreeNode addOneRow(TreeNode root, int val, int depth) {
    return TreeNodeAdapter.convertToTreeNode(
        TreeNodeAdapter.convertToUtility(root)
            .addOneRow(val, depth)
    );
  }
}
