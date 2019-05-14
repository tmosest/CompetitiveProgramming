package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class PathSumThree {

  private int pathSum = 0;

  /**
   * Find the number of paths that sum to the given value from any node downwards.
   * @param root The root node of the tree.
   * @param sum The sum we are looking for.
   * @return The number of paths.
   */
  public int pathSum(TreeNode root, int sum) {
    pathSum = 0;
    if (root == null) {
      return pathSum;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      root = queue.poll();
      findPath(root, sum);
      if (root.left != null) {
        queue.add(root.left);
      }
      if (root.right != null) {
        queue.add(root.right);
      }
    }

    return pathSum;
  }

  private void findPath(TreeNode root, int sum) {
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
