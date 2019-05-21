package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNodeAdapter;
import com.tmosest.competitiveprogramming.utils.tree.UtilTreeNode;

import java.util.Collections;
import java.util.List;

class MinimumAbsoluteDifferenceInBst {

  /**
   * Get the minimum absolute difference in a BST.
   *
   * @param root The root node of the tree.
   * @return The absolute minimum difference.
   */
  public int getMinimumDifference(TreeNode root) {
    int min = Integer.MAX_VALUE;
    UtilTreeNode<Integer> treeNode = TreeNodeAdapter.convertToUtility(root);
    List<Integer> list = treeNode.listOfValues();
    Collections.sort(list);
    for (int i = 0; i < list.size() - 1; i++) {
      min = Math.min(min, list.get(i + 1) - list.get(i));
    }
    return min;
  }
}
