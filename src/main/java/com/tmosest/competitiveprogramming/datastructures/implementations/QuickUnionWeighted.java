package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.UnionFindAdt;

/**
 * QuickUnionWeighted: The goal of this class is to improve on the previous implementation
 * (QuickUnion). In the previous implementation we created an array to store the parent id of each
 * node. To determine if two points were connected we found the roots of each node and then saw they
 * were eqaul. We knew we had found the root of a forest when the index was equal to the value
 * stored in that index. To make this algorith faster we are going to implement another array that
 * contains weights and look at those too.
 *
 * @author tmosest (Tyler Moses)
 */
public class QuickUnionWeighted implements UnionFindAdt {

  /**
   * This array determines helps point each index to its parent index. Starts with each value equal
   * to the arrau index so we know that they are not connected.
   */
  private int[] parents;
  /**
   * This array keeps track of how big each tree is getting. Should start with a value of one for
   * each tree.
   */
  private int[] weights;

  /**
   * Public constructor. Complexity of O(size). Sets up the parents and weights arrays.
   *
   * @param size Max capacity.
   */
  public QuickUnionWeighted(int size) {
    parents = new int[size];
    weights = new int[size];
    for (int i = 0; i < size; i++) {
      parents[i] = i;
      weights[i] = 1;
    }
  }

  /**
   * This function is the key to the Quick Union Algorithm. The faster we make this algorithm the
   * better the solution. In this implementation we ensure that the Algorithm is better by making
   * the forest flatter.
   *
   * @param node The point to find the root of.
   * @return The index of the root node for this point.
   */
  private int root(int node) {
    while (node != parents[node]) {
      node = parents[node];
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
   * This function links two points by making sure that the root of one points to root of the
   * other.
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
    // This is how we keep the tree flat.
    // We look at the weights and always make sure that the smaller tree points to the larger.
    if (weights[rootP] > weights[rootQ]) {
      parents[from] = rootP;
      weights[rootP] += weights[rootQ];
    } else {
      parents[to] = rootQ;
      weights[rootQ] += weights[rootP];
    }
  }

}
