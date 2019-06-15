package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNodeAdapter;
import com.tmosest.competitiveprogramming.utils.tree.UtilTreeNode;

import java.util.ArrayList;
import java.util.List;

class BinaryTreeRightSideView {

  /**
   * Determine what a binary tree would look like when looking from the right.
   *
   * @param root The root of the tree.
   * @return A list of the tree when viewed from the right.
   */
  List<Integer> rightSideView(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    // Convert to a util tree.
    UtilTreeNode<Integer> utilRoot = TreeNodeAdapter.convertToUtility(root);
    // Get each level as a list.
    for (List<Integer> level : utilRoot.iterateLevelByLevelValuesOnly()) {
      // Make sure level has a value.
      if (level.size() > 0) {
        // Get the last value for each level.
        result.add(level.get(level.size() - 1));
      }
    }
    return result;
  }
}
