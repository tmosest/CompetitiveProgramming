package com.tmosest.competitiveprogramming.datastructures;

public interface UnionFindADT {
  /**
   * Could we find a path from p to q?
   * @param p
   * @param q
   * @return
   * @throws Exception 
   */
  boolean isConnected(int p, int q) throws IndexOutOfBoundsException;
  /**
   * Connects point p to point q
   * @param p
   * @param q
   */
  void union(int p, int q) throws IndexOutOfBoundsException;
  /**
   * To implement later
   * int find (int p) component identifier for p.
   * int count() # of components
   */
}
