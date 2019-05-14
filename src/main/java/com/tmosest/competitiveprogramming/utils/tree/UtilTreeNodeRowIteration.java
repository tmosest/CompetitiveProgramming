package com.tmosest.competitiveprogramming.utils.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Allows us to iterate over a tree level by level.
 * @param <T> The type of UtilTreeNodeRowIteration iterator.
 */
public class UtilTreeNodeRowIteration<T> implements Iterable<UtilTreeNode<T>> {

  private UtilTreeNode<T> root;

  /**
   * Create a way to iterate over a TreeNode level by level.
   * @param root The root of the tree.
   */
  public UtilTreeNodeRowIteration(UtilTreeNode<T> root) {
    this.root = root;
  }

  @Override
  public Iterator<UtilTreeNode<T>> iterator() {
    return new LevelByLevelIterator<>(root);
  }

  private class LevelByLevelIterator<T> implements Iterator<UtilTreeNode<T>> {

    private Queue<UtilTreeNode<T>> queue;

    private LevelByLevelIterator(UtilTreeNode<T> root) {
      queue = new LinkedList<>();
      if (root != null) {
        queue.add(root);
      }
    }

    @Override
    public boolean hasNext() {
      return queue.size() != 0;
    }

    @Override
    public UtilTreeNode<T> next() {
      if (!hasNext()) {
        return null;
      }
      UtilTreeNode<T> result = queue.poll();
      if (result.left != null) {
        queue.add(result.left);
      }
      if (result.right != null) {
        queue.add(result.right);
      }
      return result;
    }
  }
}
