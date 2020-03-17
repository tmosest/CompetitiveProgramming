package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class VerticalOrderTraversalOfBinaryTree {

  private static class CoordinateNode implements Comparable<CoordinateNode> {

    private int row;
    private int col;
    private int val;

    private CoordinateNode(int row, int col, int val) {
      this.row = row;
      this.col = col;
      this.val = val;
    }

    @Override
    public int compareTo(CoordinateNode that) {
      if (this.col != that.col) {
        return Integer.compare(this.col, that.col);
      } else if (this.row != that.row) {
        return Integer.compare(this.row, that.row);
      } else {
        return Integer.compare(this.val, that.val);
      }
    }
  }

  List<List<Integer>> verticalTraversal(TreeNode root) {
    List<List<Integer>> results = new ArrayList<>();

    if (root == null) {
      return results;
    }

    List<CoordinateNode> list = new ArrayList<>();
    verticalTraversal(root, 0, 0, list);

    Collections.sort(list);

    int previous = list.get(0).col;
    List<Integer> previousList = new ArrayList<>();
    previousList.add(list.get(0).val);
    results.add(previousList);

    for (int i = 1; i < list.size(); i++) {
      CoordinateNode node = list.get(i);
      if (previous != node.col) {
        previousList = new ArrayList<>();
        previous = node.col;
        results.add(previousList);
      }
      previousList.add(node.val);
    }

    return results;
  }

  private void verticalTraversal(TreeNode root, int row, int col, List<CoordinateNode> list) {
    if (root == null) {
      return;
    }
    list.add(new CoordinateNode(row, col, root.val));
    verticalTraversal(root.left, row + 1, col - 1, list);
    verticalTraversal(root.right, row + 1, col + 1, list);
  }
}
