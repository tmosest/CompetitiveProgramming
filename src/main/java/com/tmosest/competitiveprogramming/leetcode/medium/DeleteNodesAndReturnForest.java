package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class DeleteNodesAndReturnForest {

  /**
   * Delete nodes from a list and return the forest.
   *
   * @param root The root of the tree.
   * @param toDelete The nodes to delete.
   * @return A list of nodes.
   */
  List<TreeNode> delNodes(TreeNode root, int[] toDelete) {
    List<TreeNode> forest = new ArrayList<>();
    Set<Integer> setToDelet = new HashSet<>();
    for (int delete : toDelete) {
      setToDelet.add(delete);
    }
    if (!setToDelet.contains(root.val)) {
      forest.add(root);
    }
    traverseAndRemove(root, null, setToDelet, forest);
    return forest;
  }

  private void traverseAndRemove(
      TreeNode root,
      TreeNode parent,
      Set<Integer> toDelete,
      List<TreeNode> forest
  ) {
    if (root == null) {
      return;
    }
    
    if (toDelete.contains(root.val)) {
      if (parent != null) {
        if (parent.left != null && parent.left.val == root.val) {
          parent.left = null;
        } else if (parent.right != null && parent.right.val == root.val) {
          parent.right = null;
        }
      }
      if (root.left != null) {
        if (!toDelete.contains(root.left.val)) {
          forest.add(root.left);
        }
      }
      if (root.right != null) {
        if (!toDelete.contains(root.right.val)) {
          forest.add(root.right);
        }
      }
    }

    traverseAndRemove(root.left, root, toDelete, forest);
    traverseAndRemove(root.right, root, toDelete, forest);
  }
}
