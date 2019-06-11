package com.tmosest.competitiveprogramming.utils.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UtilTreeNodeLevelValueIteration<T>
    implements Iterable<List<T>>, Iterator<List<T>> {

  private UtilTreeNodeLevelIteration utilTreeNodeLevelIteration;

  UtilTreeNodeLevelValueIteration(UtilTreeNode<T> root) {
    utilTreeNodeLevelIteration = new UtilTreeNodeLevelIteration<>(root);
  }

  @Override
  public Iterator<List<T>> iterator() {
    return this;
  }

  @Override
  public boolean hasNext() {
    return utilTreeNodeLevelIteration.hasNext();
  }

  @Override
  public List<T> next() {
    List<UtilTreeNode<T>> nodes = utilTreeNodeLevelIteration.next();
    List<T> result = new ArrayList<>();
    for (UtilTreeNode<T> node : nodes) {
      result.add(node.val);
    }
    return result;
  }
}
