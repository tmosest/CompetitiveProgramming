package com.tmosest.competitiveprogramming.utils.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UtilTreeNodeRootToLeafPathsIteration<T>
    implements Iterable<List<T>>, Iterator<List<T>> {

  private int index = 0;
  private List<List<T>> paths = new ArrayList<>();

  UtilTreeNodeRootToLeafPathsIteration(UtilTreeNode<T> root) {
    help(root, new ArrayList<>());
  }

  private void help(UtilTreeNode<T> root, List<T> path) {
    if (root == null) {
      return;
    }
    path.add(root.val);
    if (root.left == null && root.right == null) {
      paths.add(path);
      return;
    }
    if (root.left != null) {
      List<T> leftPath = new ArrayList<>(path.size());
      leftPath.addAll(path);
      help(root.left, leftPath);
    }
    if (root.right != null) {
      List<T> rightPath = new ArrayList<>(path.size());
      rightPath.addAll(path);
      help(root.right, rightPath);
    }
  }

  @Override
  public boolean hasNext() {
    return index < paths.size();
  }

  @Override
  public List<T> next() {
    return paths.get(index++);
  }

  @Override
  public Iterator<List<T>> iterator() {
    return this;
  }
}
