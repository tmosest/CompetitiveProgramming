package com.tmosest.competitiveprogramming.utils.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UtilTreeNodeLevelIteration<T>
    implements Iterable<List<UtilTreeNode<T>>>, Iterator<List<UtilTreeNode<T>>> {

  private Queue<UtilTreeNode<T>> queue = new LinkedList<>();

  UtilTreeNodeLevelIteration(UtilTreeNode<T> root) {
    if (root != null) {
      queue.add(root);
    }
  }

  @Override
  public Iterator<List<UtilTreeNode<T>>> iterator() {
    return this;
  }

  @Override
  public boolean hasNext() {
    return !queue.isEmpty();
  }

  @Override
  public List<UtilTreeNode<T>> next() {
    List<UtilTreeNode<T>> result = new ArrayList<>();
    int size = queue.size();
    for (int i = 0; i < size; i++) {
      UtilTreeNode<T> root = queue.poll();
      if (root.left != null) {
        queue.add(root.left);
      }
      if (root.right != null) {
        queue.add(root.right);
      }
      result.add(root);
    }
    return result;
  }
}
