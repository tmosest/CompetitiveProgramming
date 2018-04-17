package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.UnionFindAdt;

/**
 * Another implementation of Union Find. This version improves upon the Weighted Version by adding
 * Path Compression to it. Path Compressions helps to to keep the tree flat by pointing the nodes to
 * the root as we try to find it. There is really no reason not to do this since it really only adds
 * one line of code.
 *
 * @author tmosest
 */
public class QuickUnionWeightedPathCompression implements UnionFindAdt {

  private int[] parents;
  private int[] weights;

  /**
   * Create a new UF.
   *
   * @param size Max capacity.
   */
  public QuickUnionWeightedPathCompression(int size) {
    parents = new int[size];
    weights = new int[size];

    for (int i = 0; i < size; i++) {
      parents[i] = i;
      weights[i] = 1;
    }
  }

  /**
   * Function to find the root of a node p. The main difference between this implementation and the
   * last two is path compression.
   *
   * @param node The node we are looking for the root of.
   * @return The root of node p.
   */
  private int root(int node) {
    while (node != parents[node]) {
      node = parents[node];
      // This next line is all we need for compression!
      parents[node] = parents[parents[node]];
    }
    return node;
  }

  /**
   * This function determines if two points are connected or not.
   *
   * @param to One of the points.
   * @param from The other point.
   * @return True if the two points are connected and false otherwise.
   * @throws IndexOutOfBoundsException If either point is outside of the node range.
   */
  public boolean isConnected(int to, int from) throws IndexOutOfBoundsException {
    if (to < 0 || to >= parents.length || from < 0 || from >= parents.length) {
      throw new IndexOutOfBoundsException();
    }
    return root(to) == root(from);
  }

  /**
   * This function links two points by making sure that the root of one points to root of the other.
   * This version includes the improvement of the previous Weighted version.
   *
   * @param to First point to link.
   * @param from Second point to link.
   * @throws IndexOutOfBoundsException If either point is outside of the node range.
   */
  public void union(int to, int from) throws IndexOutOfBoundsException {
    if (to < 0 || to >= parents.length || from < 0 || from >= parents.length) {
      throw new IndexOutOfBoundsException();
    }
    int rootP = root(to);
    int rootQ = root(from);
    // Weighted part!
    if (weights[rootP] < weights[rootQ]) {
      parents[rootP] = rootQ;
      weights[rootQ] += weights[rootP];
    } else {
      parents[rootQ] = rootP;
      weights[rootP] += weights[rootQ];
    }
  }

}

