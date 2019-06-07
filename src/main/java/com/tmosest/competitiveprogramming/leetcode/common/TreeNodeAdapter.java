package com.tmosest.competitiveprogramming.leetcode.common;

import com.tmosest.competitiveprogramming.utils.tree.UtilTreeNode;

/**
 * Class for converting TreeNode to UtilTreeNode.
 */
public class TreeNodeAdapter {

  /**
   * Converts leetcode UtilTrieNode to a utility format.
   * @param treeNode The LeetCode UtilTrieNode.
   * @return A UtilityTreeNode.
   */
  public static UtilTreeNode<Integer> convertToUtility(TreeNode treeNode) {
    if (treeNode == null) {
      return null;
    }
    UtilTreeNode<Integer> result = new UtilTreeNode<>(treeNode.val);
    // Use recursion to fill in left sub-tree.
    if (treeNode.left != null) {
      result.left = convertToUtility(treeNode.left);
    }
    // Use recursion to fill in the right sub-tree.
    if (treeNode.right != null) {
      result.right = convertToUtility(treeNode.right);
    }
    // Return the root of tree.
    return result;
  }

  /**
   * Convert to a TreeNode.
   * @param treeNode The root of the util tree.
   * @return The root of the tree node.
   */
  public static TreeNode convertToTreeNode(UtilTreeNode<Integer> treeNode) {
    if (treeNode == null) {
      return null;
    }
    TreeNode result = new TreeNode(treeNode.val);
    // Use recursion to fill in left sub-tree.
    if (treeNode.left != null) {
      result.left = convertToTreeNode(treeNode.left);
    }
    // Use recursion to fill in the right sub-tree.
    if (treeNode.right != null) {
      result.right = convertToTreeNode(treeNode.right);
    }
    // Return the root of tree.
    return result;
  }
}