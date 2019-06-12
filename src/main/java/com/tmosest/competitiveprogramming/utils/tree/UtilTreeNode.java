package com.tmosest.competitiveprogramming.utils.tree;

import com.tmosest.competitiveprogramming.utils.graph.UtilBreathFirstSearch;
import com.tmosest.competitiveprogramming.utils.graph.UtilGraph;
import com.tmosest.competitiveprogramming.utils.graph.UtilGraphNode;

import java.util.ArrayList;
import java.util.List;

/**
 * A more universal TreeNode that can be used over and over again.
 *
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
   *
   * @return are the left and right children null.
   */
  public boolean isLeaf() {
    return left == null && right == null;
  }

  /**
   * Find the closest leaf in the path of the node value.
   *
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
   *
   * @return A way to iterate over a tree node level by level.
   */
  public UtilTreeNodeBfsIteration<T> iterateBfs() {
    return new UtilTreeNodeBfsIteration<>(this);
  }

  /**
   * Iterate over a whole level of nodes at a time.
   *
   * @return A way to iterate over a whole level as a list.
   */
  UtilTreeNodeLevelIteration<T> iterateLevelByLevel() {
    return new UtilTreeNodeLevelIteration<>(this);
  }

  /**
   * Same as iterateLevelByLevel but values only.
   *
   * @return See iterateLevelByLevel but values only.
   */
  public UtilTreeNodeLevelValueIteration<T> iterateLevelByLevelValuesOnly() {
    return new UtilTreeNodeLevelValueIteration<>(this);
  }

  /**
   * Iterate all paths from root to leafs.
   * @return A way to iterate over all root to leaf paths.
   */
  public UtilTreeNodeRootToLeafPathsIteration<T> iterateRootToLeafPathsValuesOnly() {
    return new UtilTreeNodeRootToLeafPathsIteration<>(this);
  }

  /**
   * Returns all of the none-null values in the list.
   *
   * @return A list of all the values in the tree.
   */
  public List<T> listOfValues() {
    List<T> result = new ArrayList<>();
    for (UtilTreeNode<T> node : iterateBfs()) {
      result.add(node.val);
    }
    return result;
  }

  /**
   * Determines if this tree is equal to another tree.
   *
   * @param other The other tree.
   * @return True if they are equal.
   */
  public boolean equals(UtilTreeNode<T> other) {
    return helperEquals(this, other);
  }

  private boolean helperEquals(UtilTreeNode<T> nodeOne, UtilTreeNode<T> nodeTwo) {
    if (nodeOne == null && nodeTwo == null) {
      return true;
    }
    if (nodeOne == null || nodeTwo == null) {
      return false;
    }
    if (!nodeOne.val.equals(nodeTwo.val)) {
      return false;
    }
    return helperEquals(nodeOne.left, nodeTwo.left)
        && helperEquals(nodeOne.right, nodeTwo.right);
  }

  /**
   * Add a new row to the tree.
   *
   * @param val The value for that row.
   * @param depth The depth the row should be at.
   * @return A reference to the root.
   */
  public UtilTreeNode<T> addOneRow(T val, int depth) {
    if (depth == 1) {
      UtilTreeNode<T> root = new UtilTreeNode<>(val);
      root.left = this;
      return root;
    }
    addOneRow(this, depth, val, 1);
    return this;
  }

  private void addOneRow(UtilTreeNode<T> root, int depth, T val, int level) {
    if (root == null) {
      return;
    }
    if (level == depth - 1) {
      UtilTreeNode<T> temp = root.left;
      root.left = new UtilTreeNode<T>(val);
      root.left.left = temp;
      temp = root.right;
      root.right = new UtilTreeNode<T>(val);
      root.right.right = temp;
      return;
    }
    addOneRow(root.left, depth, val, level + 1);
    addOneRow(root.right, depth, val, level + 1);
  }
}
