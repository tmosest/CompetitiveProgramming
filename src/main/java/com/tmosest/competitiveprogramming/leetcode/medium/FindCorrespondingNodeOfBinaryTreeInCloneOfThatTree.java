package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.Stack;

class FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree {

  final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned,
      final TreeNode target) {
    Stack<Character> traversalToTarget = new Stack<>();
    if (!generatePathToTarget(original, target, traversalToTarget)) {
      System.out.println("Didn't find target in original tree!");
      return null;
    }

    TreeNode current = cloned;
    while (!traversalToTarget.empty()) {
      Character direction = traversalToTarget.pop();
      if (direction == 'r') {
        current = current.right;
      } else {
        current = current.left;
      }
    }
    return current;
  }

  private boolean generatePathToTarget(TreeNode current, TreeNode target, Stack<Character> path) {
    if (current == target) {
      return true;
    }
    if (current.right == null && current.left == null) {
      return false;
    }

    if (current.right != null && generatePathToTarget(current.right, target, path)) {
      path.push('r');
      return true;
    }

    if (current.left != null && generatePathToTarget(current.left, target, path)) {
      path.push('l');
      return true;
    }

    return false;
  }
}
