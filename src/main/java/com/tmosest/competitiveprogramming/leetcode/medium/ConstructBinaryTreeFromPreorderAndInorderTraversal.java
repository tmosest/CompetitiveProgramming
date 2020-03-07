package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class ConstructBinaryTreeFromPreorderAndInorderTraversal {

  TreeNode buildTree(int[] preorder, int[] inorder) {
    int length = inorder.length;
    if (length <= 0) {
      return null;
    }

    Queue<Integer> queue = new LinkedList<>();
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < length; i++) {
      queue.add(preorder[i]);
      map.put(inorder[i], i);
    }

    int root = queue.poll();
    int val = map.get(root);

    TreeNode tree = new TreeNode(root);
    tree.left = build(queue, map, 0, val - 1);
    tree.right = build(queue, map, val + 1, length - 1);
    return tree;
  }

  private TreeNode build(Queue<Integer> queue, Map<Integer, Integer> map, int one, int two) {
    if (two - one < 0 || queue.isEmpty()) {
      return null;
    }

    int root = queue.poll();
    int temp = map.get(root);

    TreeNode tree = new TreeNode(root);
    tree.left = build(queue, map, one, temp - 1);
    tree.right = build(queue, map, temp + 1, two);
    return tree;
  }
}
