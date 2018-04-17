package com.tmosest.competitiveprogramming.datastructures;

public interface UnionFindAdt {

  /**
   * Determines if there is a connection between two points.
   *
   * @param point1 The first point.
   * @param point2 The second point.
   * @return True if there is a path between them or not.
   * @throws Exception Out of Bound exception.
   */
  boolean isConnected(int point1, int point2) throws IndexOutOfBoundsException;

  /**
   * Connects point 1 and point 2.
   *
   * @param point1 First point to be connected.
   * @param point2 Second point to be connected.
   * @throws Exception Out of Bound exception.
   */
  void union(int point1, int point2) throws IndexOutOfBoundsException;
  /* @TODO
   * To implement later
   * int find (int p) component identifier for p.
   * int count() # of components
   */
}
