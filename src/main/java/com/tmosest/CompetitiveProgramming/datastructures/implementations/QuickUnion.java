package com.tmosest.CompetitiveProgramming.datastructures.implementations;

import com.tmosest.CompetitiveProgramming.datastructures.UnionFindADT;

public class QuickUnion implements UnionFindADT {

  /**
   * In this implementation we think of nodes as a nested tree. The value of the node in the array
   * is its parent If the node value is itself then we have the root of the tree.
   */
  private int[] parents;

  private void handleoutOfBounds(int p, int q) throws IndexOutOfBoundsException {
    if (p < 0 || p >= parents.length || q < 0 || q >= parents.length)
      throw new IndexOutOfBoundsException();
  }

  public QuickUnion(int size) {
    parents = new int[size];
    for (int i = 0; i < parents.length; i++) {
      parents[i] = i;
    }
  }

  /**
   * This function is the bread and butter of this approach.
   * 
   * @param p
   * @return
   */
  private int findRoot(int p) {
    int root = p;
    while (root != parents[root]) {
      root = parents[root];
    }
    return root;
  }

  /**
   * Check if p and q have the same root.
   */
  public boolean isConnected(int p, int q) throws IndexOutOfBoundsException {
    handleoutOfBounds(p, q);
    return findRoot(p) == findRoot(q);
  }

  /**
   * Set the id of p's root to the id of q's root.
   */
  public void union(int p, int q) throws IndexOutOfBoundsException {
    handleoutOfBounds(p, q);
    int rootQ = findRoot(q);
    int rootP = findRoot(p);
    parents[rootP] = rootQ;
  }

}
