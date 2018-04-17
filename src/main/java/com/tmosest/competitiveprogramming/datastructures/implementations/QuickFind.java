package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.UnionFindAdt;

public class QuickFind implements UnionFindAdt {

  int[] ids;

  /**
   * Create a new UF.
   *
   * @param size Max capacity.
   */
  public QuickFind(int size) {
    ids = new int[size];
    for (int i = 0; i < size; i++) {
      ids[i] = i;
    }
  }

  private void handleoutOfBounds(int node1, int node2) throws IndexOutOfBoundsException {
    if (node1 < 0 || node1 >= ids.length || node2 < 0 || node2 >= ids.length) {
      throw new IndexOutOfBoundsException();
    }
  }

  /**
   * Connect two nodes.
   *
   * @param node1 First index.
   * @param node2 Second index.
   * @return True if connected.
   * @throws IndexOutOfBoundsException Index was not in UF.
   */
  public boolean isConnected(int node1, int node2) throws IndexOutOfBoundsException {
    handleoutOfBounds(node1, node2);
    return ids[node1] == ids[node2];
  }

  /**
   * Join two nodes.
   *
   * @param node1 First node.
   * @param node2 Second node.
   * @throws IndexOutOfBoundsException Index was not in UF.
   */
  public void union(int node1, int node2) throws IndexOutOfBoundsException {
    handleoutOfBounds(node1, node2);
    int node1Id = ids[node1];
    int node2Id = ids[node2]; // what was wrong with my other approach it has one less variable.
    for (int i = 0; i < ids.length; i++) {
      if (ids[i] == node1Id) {
        ids[i] = node2Id;
      }
    }
  }

}
