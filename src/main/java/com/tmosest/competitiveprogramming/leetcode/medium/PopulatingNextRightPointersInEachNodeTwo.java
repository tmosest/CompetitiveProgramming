package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.datastructures.implementations.Node;

import java.util.LinkedList;
import java.util.Queue;

class PopulatingNextRightPointersInEachNodeTwo {

  Node connect(Node root) {
    Queue<Node> queue = new LinkedList<>();
    if (root != null) {
      queue.offer(root);
    }
    while (!queue.isEmpty()) {
      int len = queue.size();
      Node previous = null;
      for (int i = 0; i < len; i++) {
        Node node = queue.poll();
        if (i != 0) {
          previous.next = node;
        }
        previous = node;
        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
      }
    }
    return root;
  }
}
