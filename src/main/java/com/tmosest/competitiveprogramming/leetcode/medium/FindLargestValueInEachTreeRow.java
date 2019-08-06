package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class FindLargestValueInEachTreeRow {

  List<Integer> largestValues(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) {
      queue.add(root);
    }
    while (!queue.isEmpty()) {
      int size = queue.size();
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < size; i++) {
        root = queue.poll();
        max = Math.max(max, root.val);
        if (root.left != null) {
          queue.add(root.left);
        }
        if (root.right != null) {
          queue.add(root.right);
        }
      }
      result.add(max);
    }
    return result;
  }
}
