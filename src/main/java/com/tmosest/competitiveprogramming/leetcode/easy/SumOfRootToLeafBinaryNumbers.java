package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import com.tmosest.competitiveprogramming.leetcode.common.TreeNodeAdapter;
import com.tmosest.competitiveprogramming.utils.tree.UtilTreeNode;

import java.util.List;

class SumOfRootToLeafBinaryNumbers {

  /**
   * Each root to leaf is a binary number. Sum all leafs.
   *
   * @param root The root of the binary tree.
   * @return The sum.
   */
  int sumRootToLeaf(TreeNode root) {
    int total = 0;
    UtilTreeNode<Integer> utilRoot = TreeNodeAdapter.convertToUtility(root);
    for (List<Integer> path : utilRoot.iterateRootToLeafPathsValuesOnly()) {
      int sum = 0;
      for (int num : path) {
        sum <<= 1;
        sum += num;
      }
      total += sum;
    }
    return total;
  }
}
