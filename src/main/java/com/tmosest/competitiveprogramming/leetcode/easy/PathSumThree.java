package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import com.tmosest.competitiveprogramming.leetcode.common.TreeNodeAdapter;
import com.tmosest.competitiveprogramming.utils.tree.UtilTreeNode;

class PathSumThree {

  private int pathSum = 0;

  /**
   * Find the number of paths that sum to the given value from any node downwards.
   *
   * @param root The root node of the tree.
   * @param sum The sum we are looking for.
   * @return The number of paths.
   */
  int pathSum(TreeNode root, int sum) {
    pathSum = 0;
    if (root == null) {
      return pathSum;
    }

    UtilTreeNode<Integer> utilRoot = TreeNodeAdapter.convertToUtility(root);
    for (UtilTreeNode<Integer> node : utilRoot.iterateBfs()) {
      findPath(node, sum);
    }

    return pathSum;
  }

  // Could refactor this into some sort of DFS.
  private void findPath(UtilTreeNode<Integer> root, int sum) {
    if (root == null) {
      return;
    }
    if (root.val == sum) {
      pathSum++;
    }
    findPath(root.left, sum - root.val);
    findPath(root.right, sum - root.val);
  }
}
