package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class VerifyPreorderSerializationOfBinaryTree {

  boolean isValidSerialization(String preorder) {
    String[] split = preorder.split(",");
    Queue<String> nodes = new LinkedList<>();
    nodes.addAll(Arrays.asList(split));
    boolean check = traverse(nodes);
    return check && nodes.isEmpty();
  }

  private boolean traverse(Queue<String> nodes) {
    if (nodes.isEmpty()) {
      return false;
    }
    if (nodes.poll().equals("#")) {
      return true;
    }
    boolean isLeftPreorder = traverse(nodes);
    boolean isRightPreorder = traverse(nodes);
    return isLeftPreorder && isRightPreorder;
  }
}
