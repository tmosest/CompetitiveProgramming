package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class PathSumTwo {
  /* Write code here. */

  public boolean debugMode = false;

  /**
   * Function to find all paths from the root that have the following sum.
   *
   * @param root The root node of the tree.
   * @param sum The desired sum of the path.
   * @return A List of all paths from the root to a leave that sum to this value.
   */
  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    List<List<TreeNode>> allPaths = new ArrayList<>();
    generateAllPaths(root, new ArrayList<>(), allPaths);
    if (debugMode) {
      printAllPaths(allPaths);
    }
    for (List<TreeNode> list : allPaths) {
      if (debugMode) {
        System.out.println("Looking at a new path");
      }
      List<Integer> path = new ArrayList<>();
      int pathSum = 0;
      for (TreeNode treeNode : list) {
        pathSum += treeNode.val;
        if (debugMode) {
          System.out.println("pathSum: " + pathSum);
        }
        path.add(treeNode.val);
      }
      if (pathSum == sum) {
        result.add(path);
      }
    }
    return result;
  }

  private void printAllPaths(List<List<TreeNode>> allPaths) {
    for (List<TreeNode> list : allPaths) {
      for (TreeNode treeNode : list) {
        System.out.print(treeNode.val + "->");
      }
      System.out.println();
    }
  }

  private void generateAllPaths(TreeNode root, List<TreeNode> parents, List<List<TreeNode>> paths) {
    if (root == null) {
      return;
    }
    parents.add(root);
    if (root.left == null && root.right == null) {
      paths.add(parents);
      return;
    }
    if (root.left != null) {
      List<TreeNode> newParents = new LinkedList<>();
      newParents.addAll(parents);
      generateAllPaths(root.left, newParents, paths);
    }
    if (root.right != null) {
      List<TreeNode> newParents = new LinkedList<>();
      newParents.addAll(parents);
      generateAllPaths(root.right, newParents, paths);
    }
  }


}
