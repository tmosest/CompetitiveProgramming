package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

class PathInZigzagLabelledBinaryTree {

  private TreeSet<Integer> tree = new TreeSet<>();
  private List<Integer> ans = new ArrayList<>();

  List<Integer> pathInZigZagTree(int label) {
    int len = 2;
    while (len < 1000001) {
      tree.add(len);
      len *= 2;
    }
    rec(label);
    Collections.reverse(ans);
    return ans;
  }

  private void rec(int label) {
    ans.add(label);
    if (label == 1) {
      return;
    }
    if (label < 4) {
      ans.add(1);
      return;
    }
    int inverse = label / 2;
    int lower = tree.lower(inverse + 1);
    int dif = inverse - lower;
    int higher = lower * 2;
    rec(higher - dif - 1);
  }
}
