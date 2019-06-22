package com.tmosest.competitiveprogramming.utils.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UtilTreeNodeInorderIteration<T> implements Iterable<UtilTreeNode<T>>,
    Iterator<UtilTreeNode<T>> {

  private Queue<UtilTreeNode<T>> queue;

  UtilTreeNodeInorderIteration(UtilTreeNode<T> root) {
    queue = new LinkedList<>();
    helper(root);
  }

  // TODO make this iterative so loop is more stream-able.
  private void helper(UtilTreeNode<T> root) {
    if (root == null) {
      return;
    }
    if (root.left != null) {
      helper(root.left);
    }
    queue.add(root);
    if (root.right != null) {
      helper(root.right);
    }
  }

  @Override
  public Iterator<UtilTreeNode<T>> iterator() {
    return this;
  }

  @Override
  public boolean hasNext() {
    return !queue.isEmpty();
  }

  @Override
  public UtilTreeNode<T> next() {
    return queue.poll();
  }
}
