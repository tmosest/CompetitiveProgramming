package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import com.tmosest.competitiveprogramming.leetcode.common.TreeNodeAdapter;
import com.tmosest.competitiveprogramming.utils.tree.UtilTreeNode;

import java.util.List;
import java.util.PriorityQueue;

class SmallestStringStartingFromLeaf {

  /**
   * Determine the smallest string that c an be made from a tree. The nodes are numbered with 1 to
   * 25.
   *
   * @param root The root node.
   * @return The smallest tree which is a path from a leaf to the root.
   */
  String smallestFromLeaf(TreeNode root) {
    if (root == null) {
      return "";
    }
    PriorityQueue<String> priorityQueue = new PriorityQueue<>();
    UtilTreeNode<Integer> utilRoot = TreeNodeAdapter.convertToUtility(root);
    for (List<Integer> path : utilRoot.iterateRootToLeafPathsValuesOnly()) {
      StringBuilder stringBuilder = new StringBuilder();
      for (int num : path) {
        stringBuilder.insert(0, getLetter(num));
      }
      priorityQueue.add(stringBuilder.toString());
    }
    return priorityQueue.poll();
  }

  private char getLetter(int val) {
    return (char) ('a' + val);
  }
}
