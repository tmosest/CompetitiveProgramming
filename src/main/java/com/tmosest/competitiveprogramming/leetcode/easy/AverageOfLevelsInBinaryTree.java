package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNodeAdapter;
import com.tmosest.competitiveprogramming.utils.stats.AverageUtil;
import com.tmosest.competitiveprogramming.utils.tree.UtilTreeNode;

import java.util.ArrayList;
import java.util.List;

class AverageOfLevelsInBinaryTree {

  /**
   * Get the average of each level in a binary tree.
   *
   * @param root The root of the tree.
   * @return The average of each level.
   */
  List<Double> averageOfLevels(TreeNode root) {
    List<Double> result = new ArrayList<>();
    UtilTreeNode<Integer> utilRoot = TreeNodeAdapter.convertToUtility(root);
    // Iterate by a whole level of values at a time.
    for (List<Integer> row : utilRoot.iterateLevelByLevelValuesOnly()) {
      // Add the average for the row.
      result.add(AverageUtil.average(row));
    }
    return result;
  }
}
