package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.HashSet;
import java.util.Set;

class FindElementsInContaminatedBinaryTree {

  private Set<Integer> set;

  FindElementsInContaminatedBinaryTree(TreeNode root) {
    set = new HashSet<>();

    if (root != null) {
      root.val = 0;
      set.add(0);
    }

    traverse(root, null, true);
  }

  private void traverse(TreeNode node, TreeNode parent, boolean isLeft) {
    if (node == null) {
      return;
    }

    if (parent != null) {
      node.val = 2 * parent.val;
      node.val += (isLeft) ? 1 : 2;
      set.add(node.val);
    }

    traverse(node.left, node, true);
    traverse(node.right, node, false);
  }

  boolean find(int target) {
    return set.contains(target);
  }
}
