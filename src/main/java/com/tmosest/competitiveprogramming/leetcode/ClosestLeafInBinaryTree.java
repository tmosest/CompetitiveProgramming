package com.tmosest.competitiveprogramming.leetcode;

public class ClosestLeafInBinaryTree {

  private int closestDistance = Integer.MAX_VALUE;
  private int closest = 0;

  /**
   * Find the value of the leaf node with the value closes to a search value.
   * @param root The root of the tree.
   * @param search The search value.
   * @return The value of the closest leaf.
   */
  public int findClosestLeaf(TreeNode root, int search) {
    closestDistance = Integer.MAX_VALUE;
    findClosestNumber(root, search);
    return closest;
  }

  private void findClosestNumber(TreeNode root, int search) {
    if (root == null) {
      return;
    }
    if (root.left == null && root.right == null) {
      int distance = Math.abs(search - root.val);
      if (distance < closestDistance) {
        closestDistance = distance;
        closest = root.val;
      }
    }
    findClosestNumber(root.left, search);
    findClosestNumber(root.right, search);
  }
}
