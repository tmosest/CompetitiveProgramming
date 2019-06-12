package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import com.tmosest.competitiveprogramming.leetcode.common.TreeNodeAdapter;
import com.tmosest.competitiveprogramming.utils.tree.UtilTreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class BinaryTreeZigzagLevelOrderTraversal {

  /**
   * Level by level traversal with zigzagging.
   *
   * @param root The root of the tree.
   * @return A list of list of zigzagged levels.
   */
  List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new LinkedList<>();
    if (root == null) {
      return result;
    }
    // Convert to generic TreeNode.
    UtilTreeNode<Integer> utilTreeRoot = TreeNodeAdapter.convertToUtility(root);
    // Iterate over values level by level.
    for (List<Integer> row : utilTreeRoot.iterateLevelByLevelValuesOnly()) {
      // Every other row, we reverse the row.
      if (result.size() == 1) {
        Collections.reverse(row);
      }
      result.add(row);
    }
    return result;
  }
}
