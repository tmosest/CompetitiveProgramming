package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.UnionFindAdt;

public class QuickFind implements UnionFindAdt {

  int[] ids;

  private void handleoutOfBounds(int p, int q) throws IndexOutOfBoundsException {
    if (p < 0 || p >= ids.length || q < 0 || q >= ids.length)
      throw new IndexOutOfBoundsException();
  }

  public QuickFind(int n) {
    ids = new int[n];
    for (int i = 0; i < n; i++) {
      ids[i] = i;
    }
  }

  public boolean isConnected(int p, int q) throws IndexOutOfBoundsException {
    handleoutOfBounds(p, q);
    return ids[p] == ids[q];
  }

  public void union(int p, int q) throws IndexOutOfBoundsException {
    handleoutOfBounds(p, q);
    int pId = ids[p];
    int qId = ids[q]; // what was wrong with my other approach it has one less variable.
    for (int i = 0; i < ids.length; i++) {
      if (ids[i] == pId) {
        ids[i] = qId;
      }
    }
  }

}
