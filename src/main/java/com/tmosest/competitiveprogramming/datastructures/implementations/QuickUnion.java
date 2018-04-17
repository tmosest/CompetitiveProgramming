package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.UnionFindAdt;

public class QuickUnion implements UnionFindAdt {

  /**
   * In this implementation we think of nodes as a nested tree. The value of the node in the array
   * is its parent If the node value is itself then we have the root of the tree.
   */
  private int[] parents;

  /**
   * Create a new UF.
   *
   * @param size Max size.
   */
  public QuickUnion(int size) {
    parents = new int[size];
    for (int i = 0; i < parents.length; i++) {
      parents[i] = i;
    }
  }

  private void handleoutOfBounds(int node1, int node2) throws IndexOutOfBoundsException {
    if (node1 < 0 || node1 >= parents.length || node2 < 0 || node2 >= parents.length) {
      throw new IndexOutOfBoundsException();
    }
  }

  /**
   * This function is the bread and butter of this approach.
   */
  private int findRoot(int node) {
    int root = node;
    while (root != parents[root]) {
      root = parents[root];
    }
    return root;
  }

  /**
   * Check if p and q have the same root.
   *
   * @param to first node.
   * @param from second node.
   * @return true if connected.
   */
  public boolean isConnected(int to, int from) throws IndexOutOfBoundsException {
    handleoutOfBounds(to, from);
    return findRoot(to) == findRoot(from);
  }

  /**
   * Set the id of p's root to the id of q's root.
   *
   * @param to first node.
   * @param from second node.
   */
  public void union(int to, int from) throws IndexOutOfBoundsException {
    handleoutOfBounds(to, from);
    int rootQ = findRoot(to);
    int rootP = findRoot(from);
    parents[rootP] = rootQ;
  }

}
