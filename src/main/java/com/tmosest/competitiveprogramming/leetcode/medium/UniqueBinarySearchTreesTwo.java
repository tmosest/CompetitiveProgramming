package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class UniqueBinarySearchTreesTwo {

  List<TreeNode> generateTrees(int num) {
    if (num == 0) {
      return new ArrayList<>();
    }

    return generateTrees(1, num);
  }

  private List<TreeNode> generateTrees(int low, int high) {
    List<TreeNode> res = new ArrayList<>();
    if (low > high) {
      res.add(null);
      return res;
    }

    for (int i = low; i <= high; i++) {

      List<TreeNode> leftSubtrees = generateTrees(low, i - 1);
      List<TreeNode> rightSubtrees = generateTrees(i + 1, high);

      for (TreeNode leftSubtree : leftSubtrees) {
        for (TreeNode rightSubtree : rightSubtrees) {
          TreeNode root = new TreeNode(i);
          root.left = leftSubtree;
          root.right = rightSubtree;
          res.add(root);
        }
      }
    }
    return res;
  }
}
