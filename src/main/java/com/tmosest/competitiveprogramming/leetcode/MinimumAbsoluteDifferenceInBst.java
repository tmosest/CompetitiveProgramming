package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceInBst {

  /**
   * Get the minimum absolute difference in a BST.
   * @param root The root node of the tree.
   * @return The absolute minimum difference.
   */
  public int getMinimumDifference(TreeNode root) {
    int min = Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<>();
    getValuesInBst(root, list);
    Collections.sort(list);
    for (int i = 0; i < list.size() - 1; i++) {
      min = Math.min(min, list.get(i + 1) - list.get(i));
    }
    return min;
  }

  private void getValuesInBst(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    list.add(root.val);
    getValuesInBst(root.left, list);
    getValuesInBst(root.right, list);
  }
}
