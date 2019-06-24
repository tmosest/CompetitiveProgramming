package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PrintBinaryTree {

  List<List<String>> printTree(TreeNode root) {
    int height = getHeight(root);
    String[][] res = new String[height][(1 << height) - 1];
    for (String[] arr : res) {
      Arrays.fill(arr, "");
    }
    List<List<String>> ans = new ArrayList<>();
    fill(res, root, 0, 0, res[0].length);
    for (String[] arr : res) {
      ans.add(Arrays.asList(arr));
    }
    return ans;
  }

  private void fill(String[][] res, TreeNode root, int row, int len, int rot) {
    if (root == null) {
      return;
    }
    res[row][(len + rot) / 2] = "" + root.val;
    fill(res, root.left, row + 1, len, (len + rot) / 2);
    fill(res, root.right, row + 1, (len + rot + 1) / 2, rot);
  }

  private int getHeight(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Math.max(getHeight(root.left), getHeight(root.right));
  }
}
