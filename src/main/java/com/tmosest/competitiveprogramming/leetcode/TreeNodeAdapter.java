package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.utils.UtilTreeNode;

/**
 * Class for converting TreeNode to UtilTreeNode.
 */
public class TreeNodeAdapter {

  /**
   * Converts leetcode UtilTrieNode to a utility format.
   * @param treeNode The LeetCode UtilTrieNode.
   * @return A UtilityTreeNode.
   */
  static UtilTreeNode<Integer> convertToUtility(TreeNode treeNode) {
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
}
