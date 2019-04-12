package com.tmosest.competitiveprogramming.utils;

import java.util.ArrayList;
import java.util.List;

public class UtilGraphNode<T> {
  public int id;
  public T val;
  public List<UtilGraphNode<T>> neighbors;

  /**
   * Create a graph node.
   * @param id The id of the node.
   * @param val The value of the node.
   */
  public UtilGraphNode(int id, T val) {
    this.id = id;
    this.val = val;
    neighbors = new ArrayList<>();
  }

  /**
   * Determines if this graph is the end of a trail.
   * Aka you can only go one way at most.
   * @return True if it would be a leaf from a tree node or island essentially.
   */
  public boolean isLeaf() {
    return neighbors.size() < 2;
  }
}
