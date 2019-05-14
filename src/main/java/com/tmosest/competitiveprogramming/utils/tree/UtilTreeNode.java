package com.tmosest.competitiveprogramming.utils.tree;

import com.tmosest.competitiveprogramming.utils.graph.UtilBreathFirstSearch;
import com.tmosest.competitiveprogramming.utils.graph.UtilGraph;
import com.tmosest.competitiveprogramming.utils.graph.UtilGraphNode;

import java.util.ArrayList;
import java.util.List;

/**
 * A more universal TreeNode that can be used over and over again.
 * @param <T> Type of TreeNode.
 */
public class UtilTreeNode<T> {
  public T val;
  public UtilTreeNode<T> left;
  public UtilTreeNode<T> right;

  public UtilTreeNode(T val) {
    this.val = val;
  }

  /**
   * Determines if a node is a leaf node.
   * @return are the left and right children null.
   */
  public boolean isLeaf() {
    return left == null && right == null;
  }

  /**
   * Find the closest leaf in the path of the node value.
   * @param search The node value to start searching from.
   * @return The value of the closest leaf's value.
   */
  public T findClosestLeaf(T search) {
    // Create a utilGraph from the leaf node.
    UtilGraph<T> utilGraph = new UtilGraph<>(this);
    UtilGraphNode<T> searchNode = utilGraph.find(search);
    // Iterator to make it easy to go over the utilGraph with BFS.
    UtilBreathFirstSearch<T> utilBreathFirstSearch =
        new UtilBreathFirstSearch<>(utilGraph, searchNode);
    // Now we can for-each loop over the iterator!
    for (UtilGraphNode<T> node : utilBreathFirstSearch) {
      if (node.isLeaf()) {
        return node.val;
      }
    }
    return null;
  }

  /**
   * Iterate level by level starting at this node.
   * @return A way to iterate over a tree node level by level.
   */
  public UtilTreeNodeRowIteration<T> iterateLevelByLevel() {
    return new UtilTreeNodeRowIteration<>(this);
  }

  /**
   * Returns all of the none-null values in the list.
   * @return A list of all the values in the tree.
   */
  public List<T> listOfValues() {
    List<T> result = new ArrayList<>();
    for (UtilTreeNode<T> node : iterateLevelByLevel()) {
      result.add(node.val);
    }
    return result;
  }
}
